<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <title>登录页面 - 人事管理Hrm1.0 系统</title>
    <link rel="icon" href="favicon.ico" type="image/ico">
    <meta name="keywords" content="人事管理Hrm1.0 系统">
    <meta name="description" content="LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。">
    <meta name="author" content="yinqi">
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
    <link href="../../css/materialdesignicons.min.css" rel="stylesheet">
    <link href="../../css/style.min.css" rel="stylesheet">
    <style>
        .lyear-wrapper {
            position: relative;
        }
        .lyear-login {
            width: 500px;
            height: 500px;
            margin: auto;
            display: flex !important;
            min-height: 100vh;
            align-items: center !important;
            justify-content: center !important;
        }
        .lyear-login:after{
            content: '';
            min-height: inherit;
            font-size: 0;
        }
        .login-center {
            background: #fff;
            min-width: 29.25rem;
            padding: 2.14286em 3.57143em;
            border-radius: 3px;
            margin: 2.85714em;
        }
        .login-header {
            margin-bottom: 1.5rem !important;
        }
        .login-center .has-feedback.feedback-left .form-control {
            padding-left: 38px;
            padding-right: 12px;
        }
        .login-center .has-feedback.feedback-left .form-control-feedback {
            left: 0;
            right: auto;
            width: 38px;
            height: 38px;
            line-height: 38px;
            z-index: 4;
            color: #dcdcdc;
        }
        .login-center .has-feedback.feedback-left.row .form-control-feedback {
            left: 15px;
        }
        .logo {
            height: 80px;
            overflow: hidden;
        }

        .logo img {
            width: 100%;
            height: 100%;
            object-fit: contain;
        }
    </style>
</head>

<body></body>
<div class="row lyear-wrapper" style="background-image: url(https://jw.gdou.edu.cn/xtgl/dlycssz_cxDlycsszZp.html?zplx=3&t=1703579902954); background-size: cover;">
    <div class="lyear-login" style="background-color: #e1f1f6;">
        <div class="login-header text-center">
            <div class="logo">
                <img src="https://www.gdou.edu.cn/img/logo1.png">
            </div>
            <div class="login-center">
                <h1>后台管理系统</h1>
            </div>
            <form action="login.action" method="get">
                <div class="form-group has-feedback feedback-left">
                    <input type="text" placeholder="请输入您的用户名" class="form-control" name="loginname" id="loginname" />
                    <span class="mdi mdi-account form-control-feedback" aria-hidden="true"></span>
                </div>
                <div class="form-group has-feedback feedback-left">
                    <input type="password" placeholder="请输入密码" class="form-control" id="password" name="password" />
                    <span class="mdi mdi-lock form-control-feedback" aria-hidden="true"></span>
                </div>
                <div class="form-group has-feedback feedback-left row">
                    <div class="col-xs-7">
                        <input  name="code"  placeholder="验证码"  class="form-control">
                        <span class="mdi mdi-check-all form-control-feedback" aria-hidden="true"></span>
                    </div>
                    <div class="col-xs-5">
                        <img src="checkCode" class="pull-right" id="captcha" style="cursor: pointer;" onclick="changeCheckCode(this)" title="点击刷新" alt="captcha">
                    </div>
                </div>

                <div class="form-group">
                    <button class="btn btn-block btn-primary" type="submit" id="login-submit-btn" >立即登录</button>
                </div>
            </form>
        </div>
    </div>
</div>

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
    //图片点击事件
    function changeCheckCode(img) {
        img.src="checkCode?"+new Date().getTime();
    }
</script>
<script type="text/javascript">

    $(function(){
        /** 按了回车键 */
        $(document).keydown(function(event){
            if(event.keyCode == 13){
                $("#login-submit-btn").trigger("click");
            }
        })

        /** 给登录按钮绑定点击事件  */
        $("#login-submit-btn").on("click",function(){
            /** 校验登录参数 ctrl+K */
            var loginname = $("#loginname").val();
            var password = $("#password").val();

            var msg = "";

            if(!/^\w{4,20}$/.test(loginname)){
                msg = "登录名长度必须是4~20之间";
            }else if(!/^\w{4,20}$/.test(password)){
                msg = "密码长度必须是4~20之间";
            }
            if(msg !=""){
                alert(msg);
                return false;
            }
            /** 提交表单 */
            $("#loginForm").submit();

        })

    })
</script >
</body>
</html>