
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>用户列表编辑</title>
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
                    <div class="col-md-24">
                        <div class="card">
                            <div class="card-header"><h4>用户修改</h4></div>
                            <div class="card-body">

                                <form class="form-horizontal" action="${ctx}/usereditsave.action" method="get" enctype="multipart/form-data" >
                                    <input  type="hidden" id="id" name="id"  value="${user.id}" >
                                    <div class="form-group">
                                        <label class="col-xs-12" for="username">姓名</label>
                                        <div class="col-xs-4">
                                            <input class="form-control" type="text" id="username" name="username"  value="${user.username}" placeholder="姓名..">
                                            <div class="help-block">输入更多信息</div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-12" for="loginname">登录名</label>
                                        <div class="col-xs-4">
                                            <input class="form-control" type="text" id="loginname" name="loginname" value="${user.loginname}" placeholder="邮箱..">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-xs-12" for="password">密码</label>
                                        <div class="col-xs-4">
                                            <input class="form-control"  id="password" name="password" value="${user.password}" placeholder="密码..">
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-xs-12" for="example-select">状态</label>
                                        <div class="col-xs-4">
                                            <select class="form-control" id="example-select" name="status" size="1">
                                                <option selected value="1">启用</option>
                                                <option value="2">审核</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-xs-12">
                                            <button class="btn btn-primary" type="submit">提交</button>
                                        </div>
                                    </div>
                                </form>

                            </div>
                        </div>
                    </div>

        </main>
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

</script>
</body>
</html>