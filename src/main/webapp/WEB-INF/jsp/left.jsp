<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="lyear-layout-sidebar">

    <!-- logo -->
    <div id="logo" class="sidebar-header">
        <a href="index.html"><img src="https://www.gdou.edu.cn/img/logo1.png" title="LightYear" alt="LightYear" /></a>
    </div>
    <div class="lyear-layout-sidebar-scroll">

        <nav class="sidebar-main">
            <ul class="nav nav-drawer">
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-palette"></i> 用户管理</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${ctx}/userlist.action">用户查询</a> </li>
                        <li> <a href="${ctx}/useradd.action">用户添加</a> </li>

                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-format-align-justify"></i> 部门管理</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${ctx}/deptlist.action">部门查询</a> </li>
                        <li> <a href="${ctx}/deptadd.action">部门添加</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-file-outline"></i> 职位管理</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${ctx}/joblist.action">职位查询</a> </li>
                        <li> <a href="${ctx}/jobadd.action">职位添加</a> </li>
                    </ul>
                </li>
                <li class="nav-item nav-item-has-subnav">
                    <a href="javascript:void(0)"><i class="mdi mdi-language-javascript"></i> 员工管理</a>
                    <ul class="nav nav-subnav">
                        <li> <a href="${ctx}/employeelist.action">员工查询</a> </li>
                        <li> <a href="${ctx}/employeeadd.action">员工添加</a> </li>
                    </ul>
                </li>
            </ul>
        </nav>

        <div class="sidebar-footer">
            <p class="copyright">Made by 啥也不会队 2023.12.27</p>
        </div>
    </div>

</aside>
