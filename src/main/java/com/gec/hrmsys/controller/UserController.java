package com.gec.hrmsys.controller;

import com.gec.hrmsys.domain.PageModel;
import com.gec.hrmsys.domain.User;
import com.gec.hrmsys.service.UserService;
import com.gec.hrmsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author cr
 * @date 2023年12月11日 20:45
 * @description 用户的控制层类
 */
@WebServlet(urlPatterns = {"/userlist.action","/useradd.action","/useraddsave.action"
        ,"/useredit.action","/usereditsave.action","/userdelbyid.action","/userdel.action"})
public class UserController  extends HttpServlet {
        UserService userService= new UserServiceImpl();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取路径 来判断 用户执行 什么操作
        String uri = req.getRequestURI();
        String action = uri.substring(uri.lastIndexOf("/") + 1, uri.length());
        if(action.equals("userlist.action")){
            //用户查询的请求 ,调用业务层接口来执行查询操作
            //1.获取前端传递的数据 loginname=zhangsan&username=123&status=1
            String loginname = req.getParameter("loginname");
            String username = req.getParameter("username");
            String status = req.getParameter("status");

            //2. 将数据放入的对象中 供业务层使用
            User user = new User();
            user.setUsername(username);
            user.setLoginname(loginname);
            user.setStatus(status!=null&&!status.equals("")?Integer.parseInt(status):null);


            //前端会传递 查询的当前页码
            String pageIndex = req.getParameter("pageIndex");
            //创建分页返回对象
            PageModel pageModel = new PageModel();
            //将前端传递的 查询当前页 放入返回对象

            if(pageIndex!=null&&!pageIndex.equals("")){
                pageModel.setPageIndex(Integer.parseInt(pageIndex));
            }else{
                pageModel.setPageIndex(1);
            }



            //List<User> list =  userService.queryAll(); 查询用户表所有数据
            //执行根据 要查询的页码查询数据
            List<User> list =  userService.querUserListBypage(user,pageModel);
            //将分页对象放入 请求域当中进行转发
            req.setAttribute("pageModel",pageModel);
            req.setAttribute("userlist",list);
            //用户来转发用户查询的参数
            req.setAttribute("user",user);
           //返回参数 转发给 前端页面去显示
            req.getRequestDispatcher("/WEB-INF/jsp/user/userlist.jsp").forward(req,resp);
        }else if(action.equals("useradd.action")) {
            //跳转到添加页面
            req.getRequestDispatcher("/WEB-INF/jsp/user/useradd.jsp").forward(req,resp);
        }else if(action.equals("useraddsave.action")){
            //用户添加操作
            //获取页面传第的参数
            String loginname = req.getParameter("loginname");
            String username = req.getParameter("username");
            String status = req.getParameter("status");
            String password = req.getParameter("password");
            //创建一个 用户保存对象
            User user = new User();
            user.setUsername(username);
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setStatus(status!=null&&!status.equals("")?Integer.parseInt(status):null);
            user.setCreateDate(new Date());
            //调用业务层方法 进行执行保存业务
            userService.saveUser(user);
            //重新查询用户信息 重定向到 查询请求
            resp.sendRedirect(this.getServletContext().getContextPath()+"/userlist.action");
        }else if(action.equals("useredit.action")){
            //通过id 获取用户信息
            String id = req.getParameter("id");
            User user = userService.getUserById(Integer.parseInt(id));
            req.setAttribute("user",user);
            req.getRequestDispatcher("/WEB-INF/jsp/user/useredit.jsp").forward(req,resp);
        }else if("usereditsave.action".equals(action)){
            //执行修改
            String id = req.getParameter("id");
            String loginname = req.getParameter("loginname");
            String username = req.getParameter("username");
            String status = req.getParameter("status");
            String password = req.getParameter("password");
            //创建一个 用户保存对象
            User user = new User();
            user.setId(Integer.parseInt(id));
            user.setUsername(username);
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setStatus(status!=null&&!status.equals("")?Integer.parseInt(status):null);
            user.setCreateDate(new Date());
            //调用业务层方法 进行执行保存业务
            userService.editUser(user);
            //重新查询用户信息 重定向到 查询请求
            resp.sendRedirect(this.getServletContext().getContextPath()+"/userlist.action");

        }else if(action.equals("userdelbyid.action")){
            //获取id 通过id 进行删除
            Integer id = Integer.parseInt(req.getParameter("id"));
            userService.delbyid(id);
            //重新查询用户信息 重定向到 查询请求
            resp.sendRedirect(this.getServletContext().getContextPath()+"/userlist.action");
        }else if(action.equals("userdel.action")){
            //1.获取前端选中的要删除的 用户id
            String[] userIds = req.getParameterValues("userIds");
            //调用业务删除方法
            userService.deleteAll(userIds);
            //重新查询用户信息 重定向到 查询请求
            resp.sendRedirect(this.getServletContext().getContextPath()+"/userlist.action");
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
