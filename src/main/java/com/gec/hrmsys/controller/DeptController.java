package com.gec.hrmsys.controller;


import com.gec.hrmsys.domain.Dept;
import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;
import com.gec.hrmsys.service.DeptService;
import com.gec.hrmsys.service.UserService;
import com.gec.hrmsys.service.impl.DeptServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "DeptController",urlPatterns = {"/deptlist.action"})
public class DeptController extends HttpServlet {

    DeptService deptService = new DeptServiceImpl();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取路径 来判断 用户执行 什么操作
        String uri = req.getRequestURI();
        System.out.println(uri);
        String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());
        if(action.equals("deptlist.action")) {
            //用户查询的请求 ,调用业务层接口来执行查询操作
            //前端会传递 查询的当前页码
            String pageIndex = req.getParameter("pageIndex");
            //创建分页返回对象
            PageModel pageModel = new PageModel();
            //将前端传递的 查询当前页 放入返回对象

            pageModel.setPageIndex(pageIndex != null && !pageIndex.equals("") ? Integer.parseInt(pageIndex):1);


            List<Dept> list = deptService.getDeptByPage(pageModel);

            req.setAttribute("pageModel",pageModel);
            req.setAttribute("deptlist", list);
            req.getRequestDispatcher("/WEB-INF/jsp/dept/deptlist.jsp").forward(req,resp);
        }
    }
}
