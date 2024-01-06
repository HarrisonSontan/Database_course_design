package com.gec.hrmsys.controller;

import com.gec.hrmsys.domain.User;
import com.gec.hrmsys.service.UserService;
import com.gec.hrmsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 跳转到登录页 登录验证实现
 * 
 */
@WebServlet(name = "HrmLoginController", urlPatterns = { "/tologinform.action", "/login.action","/logout.action" })
public class HrmLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 创建UserService对象
	UserService userService = new UserServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());

		if (action.equals("tologinform.action")) {
			request.getRequestDispatcher("/WEB-INF/jsp/loginForm.jsp").forward(request, response);
		}else if (action.equals("login.action")) {

			//获取页面提交验证码
			String code = request.getParameter("code");
			HttpSession session = request.getSession();
			//获取session中存储验证码
			String checkcode = (String) session.getAttribute("CHECKCODE");

			if(code.equalsIgnoreCase(checkcode)){

				//验证码验证成功 获取账号密码去 数据库验证身份
				String loginname = request.getParameter("loginname");
				String password = request.getParameter("password");
				User outUser = userService.findUserByLogin(loginname, password);

				if (outUser != null) {
					session.setAttribute("user_inf", outUser);
					System.out.println("login enable ");
					response.sendRedirect(this.getServletContext().getContextPath() + "/main.action");
				} else {
					response.sendRedirect(this.getServletContext().getContextPath()+"/tologinform.action");
				}
			}else{
				//验证码验证失败
				request.setAttribute("msg","验证码验证失败,请重试");
				request.getRequestDispatcher("/WEB-INF/jsp/loginForm.jsp").forward(request, response);
			}
		}else if("logout.action".equals(action)){

			HttpSession session = request.getSession();
			session.invalidate();//使该session无效
			request.getRequestDispatcher("/WEB-INF/jsp/loginForm.jsp").forward(request, response);

		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
