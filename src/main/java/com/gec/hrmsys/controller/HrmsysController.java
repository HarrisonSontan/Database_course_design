package com.gec.hrmsys.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HrmsysController", urlPatterns = {"/main.action"})
public class HrmsysController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());

        if(action.equals("main.action")){
            //当前请求是来进行首页跳转
            request.getRequestDispatcher("/WEB-INF/jsp/main.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
