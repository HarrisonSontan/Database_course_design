package com.gec.hrmsys.controller;

import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.Employee;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.service.EmployeeService;
import com.gec.hrmsys.service.impl.EmployeeServiceImpl;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

@WebServlet(name = "EmployeeController", urlPatterns = { "/employeelist.action",
		"/employeeadd.action","/getcardid.action","/empaddsave.action" })
public class EmployeeController extends HttpServlet {
	// 创建用户业务逻辑类的对象
	EmployeeService employeeService = new EmployeeServiceImpl();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());
		if (action.equals("employeelist.action")) {
			String pageIndex = request.getParameter("pageIndex");
			PageModel pageModel = new PageModel();
			pageModel.setPageIndex(pageIndex != null && !pageIndex.equals("") ? Integer.parseInt(pageIndex) : 1);
			// 获取用户列表数据
			List<Employee> employeelist = employeeService.queryEmployeeListByPage(pageModel);

			// request作用域
			request.setAttribute("employeelist", employeelist);
			request.setAttribute("pageModel", pageModel);
			request.getRequestDispatcher("/WEB-INF/jsp/employee/employeelist.jsp").forward(request, response);
		}else if (action.equals("employeeadd.action")) {//员工页面跳转的 请求处理
			//查询出所有部门名
			List<Dept> deptList = employeeService.getEmployeeByDept();
			//查询所有职位
			List<Job> jobList = employeeService.getEmployeeByJob();
			request.setAttribute("deptList", deptList);
			request.setAttribute("jobList", jobList);
			//转发到employeeadd.jsp 页面
			request.getRequestDispatcher("/WEB-INF/jsp/employee/empadd.jsp").forward(request, response);
		}else if (action.equals("getcardid.action")) {
			String cardId = request.getParameter("cardId");//form 表单数据

			Gson gson = new Gson();
			// 将json数据解释到员工的javabean属性中
			Employee inEmployee = gson.fromJson(request.getReader(), Employee.class);

			System.out.println("cardid=" + inEmployee.getCardId());
			// 根据cardid检索员工表
			//通过身份证号查询 员工表 是否存在该身份证
			boolean isEnable = employeeService.queryEmployeeListByCardId(inEmployee.getCardId());

			String resultJon = gson.toJson(isEnable);
			System.out.println("resultJon=" + resultJon);
			// 以json数据格式作响应
			response.setContentType("application/json; charset=utf-8");
			OutputStream out = response.getOutputStream();
			out.write(resultJon.getBytes());
			out.flush();

		}else if(action.equals("empaddsave.action")){
			//获取必要的数据
			String cardId = request.getParameter("cardId");
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			Integer sex = Integer.parseInt(request.getParameter("sex"));

			Integer dept_id = Integer.parseInt(request.getParameter("dept_id"));
			Integer job_id = Integer.parseInt(request.getParameter("job_id"));

			Employee employee = new Employee();
			employee.setAddress(address);
			employee.setCardId(cardId);
			employee.setCreateDate(new Date());
			employee.setEmail(email);
			employee.setName(name);
			employee.setPhone(phone);
			employee.setSex(sex);

			Dept dept = new Dept();
			dept.setId(dept_id);
			employee.setDept(dept);

			Job job = new Job();
			job.setId(job_id);
			employee.setJob(job);

			//执行业务添加方法
			employeeService.empSave(employee);
			response.sendRedirect(this.getServletContext().getContextPath()+"/employeelist.action");
		}
	}
}
