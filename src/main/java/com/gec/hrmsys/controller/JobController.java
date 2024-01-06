package com.gec.hrmsys.controller;
import com.gec.hrmsys.domain.Job;
import com.gec.hrmsys.service.JobService;
import com.gec.hrmsys.service.impl.JobServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "jobController",urlPatterns = {"/joblist.action"})
public class JobController extends HttpServlet {

    //创建业务接口方法
    JobService jobService = new JobServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        System.out.println(uri);
        String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());

        if(action.equals("joblist.action")){
            //当前请求是来进行首页跳转
            List<Job> list = jobService.getDeptAll();

            req.setAttribute("joblist",list);
            req.getRequestDispatcher("/WEB-INF/jsp/job/joblist.jsp").forward(req,resp);
        }

    }


}
