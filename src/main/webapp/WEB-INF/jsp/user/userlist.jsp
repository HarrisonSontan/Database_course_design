
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>用户列表</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <meta name="keywords" content="LightYear,光年,后台模板,后台管理系统,光年HTML模板">
    <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
    <meta name="author" content="yinqi">
    <link href="../../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../../css/materialdesignicons.min.css" rel="stylesheet">
    <link href="../../../css/style.min.css" rel="stylesheet">
</head>

<body>

<div class="lyear-layout-web">
    <div class="lyear-layout-container">
        <!--左侧导航-->
        <jsp:include page="../left.jsp"></jsp:include>
        <!--End 左侧导航-->

        <!--头部信息-->
        <jsp:include page="../header.jsp"></jsp:include>


        <!--页面主要内容-->
        <main class="lyear-layout-content">

            <div class="container-fluid">

                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">

                            <div class="card-body">
                                <form class="form-inline" action="${ctx}/userlist.action" method="get" >
                                    <div class="form-group">
                                        <label class="sr-only" for="loginname">登录名</label>
                                        <input class="form-control" type="text" id="loginname" name="loginname" value="${user.loginname}" placeholder="请输入登录名..">
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only" for="username">用户名</label>
                                        <input class="form-control" type="text" id="username" name="username" value="${user.username}" placeholder="请输入用户名..">
                                    </div>
                                    <div class="form-group">
                                        <div class="col-xs-12">
                                            <select class="form-control" id="example-select" name="status" size="1">
                                                <option value="0"  >用户状态</option>
                                                <option value="1" <c:if test="${user.status ==1}">selected </c:if>  >启用</option>
                                                <option value="2" <c:if test="${user.status ==2}">selected </c:if> >审核</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <button class="btn btn-default" type="submit">查询</button>
                                    </div>
                                </form>
                            </div>
                            <div class="card-toolbar clearfix">
                                <form class="pull-right search-bar" method="get" action="#!" role="form">
                                    <div class="input-group">
                                        <input type="text" class="form-control" value="" name="keyword" placeholder="请输入名称">
                                    </div>
                                </form>
                                <div class="toolbar-btn-action">
                                    <a class="btn btn-primary m-r-5" href="#!"><i class="mdi mdi-plus"></i> 新增</a>
                                    <a class="btn btn-danger" id="delAll" href="#!"><i class="mdi mdi-window-close"></i> 删除</a>
                                </div>
                            </div>
                            <div class="card-body">

                                <div class="table-responsive">
                                    <table class="table table-bordered">
                                        <thead>
                                        <tr>
                                            <th>
                                                <label class="lyear-checkbox checkbox-primary">
                                                    <input type="checkbox" id="check-all"><span></span>
                                                </label>
                                            </th>
                                            <th>登录名</th>
                                            <th>密码</th>
                                            <th>用户名</th>
                                            <th>状态</th>
                                            <th>创建时间</th>
                                            <th>操作</th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <form class="form-inline" id="userform" action="${ctx}/userlist.action" method="get" >
                                        <c:forEach  var="user" items="${userlist}" >
                                        <tr>
                                            <td>
                                                <label class="lyear-checkbox checkbox-primary">
                                                    <input type="checkbox" name="userIds" value="${user.id}"><span></span>
                                                </label>
                                            </td>
                                            <td>${user.loginname}</td>
                                            <td>${user.password}</td>
                                            <td>${user.username}</td>
                                            <td>${user.status}</td>
                                            <td>${user.createDate}</td>
                                            <td><font class="text-success">正常</font></td>
                                            <td>
                                                <div class="btn-group">
                                                    <a class="btn btn-xs btn-default" href="${ctc}/useredit.action?id=${user.id}" title="编辑" data-toggle="tooltip"><i class="mdi mdi-pencil"></i></a>
                                                    <a class="btn btn-xs btn-default" href="#!" title="查看" data-toggle="tooltip"><i class="mdi mdi-eye"></i></a>
                                                    <a class="btn btn-xs btn-default" href="${ctc}/userdelbyid.action?id=${user.id}" title="删除" data-toggle="tooltip"><i class="mdi mdi-window-close"></i></a>
                                                </div>
                                            </td>
                                        </tr>
                                        </c:forEach>
                                        </form>
                                        </tbody>
                                    </table>
                                </div>
                                <ul class="pagination">
                                    总共${pageModel.totalRecordSum}条数据 总共${pageModel.totalPageSum}页
                                    <li ><span id="pre">«</span></li>


                                        <c:forEach  begin="1" end="${pageModel.totalPageSum}" varStatus="i">
                                            <li <c:if test="${pageModel.pageIndex==i.count}" > class='active'</c:if>>
                                                <a href="${ctx}/userlist.action?pageIndex=${i.count}">${i.count}</a>
                                            </li>
                                        </c:forEach>


                                    <li><span id="next">»</span></li>
                                </ul>

                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </main>
        <!--End 页面主要内容-->
    </div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="js/main.min.js"></script>
<script type="text/javascript">
    $(function(){
        $('.search-bar .dropdown-menu a').click(function() {
            var field = $(this).data('field') || '';
            $('#search-field').val(field);
            $('#search-btn').html($(this).text() + ' <span class="caret"></span>');
        });
    });


    $(function(){
        $("#pre").click(function(){
            if (${pageModel.pageIndex-1<=0}) {
                alert('已经到顶啦！');
                return;
            }
            window.location.href = "${ctx}/userlist.action?pageIndex=${pageModel.pageIndex - 1}&loginname=${user.loginname}&username=${user.username}&status=${user.status}"
        })

        $("#next").click(function(){
            if (${pageModel.pageIndex+1>pageModel.totalPageSum}) {
                alert('已经到顶啦！');
                return;
            }
            window.location.href = "${ctx}/userlist.action?pageIndex=${pageModel.pageIndex +1}&loginname=${user.loginname}&username=${user.username}&status=${user.status}"
        })


        $('#delAll').click(function () {
            //获取所有被选中元素
            var checkedBoxs=   $('input:checkbox[name=userIds]:checked');
            //alert(checkedBoxs.length);
            if(checkedBoxs.length < 1){
                alert("请选择一个需要删除的用户！");
            }else{
                $("#userform").attr("action", "${ctx}/userdel.action");
                $("#userform").submit();
            }
        })
    })


</script>
</body>
</html>