/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-12-27 01:01:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/taglib.jsp", Long.valueOf(1702297495582L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- å®ä¹å¨å±åéæè¿°ç«ç¹å -->\r\n");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" />\r\n");
      out.write("    <title>登录页面 - 人事管理Hrm1.0 系统</title>\r\n");
      out.write("    <link rel=\"icon\" href=\"favicon.ico\" type=\"image/ico\">\r\n");
      out.write("    <meta name=\"keywords\" content=\"人事管理Hrm1.0 系统\">\r\n");
      out.write("    <meta name=\"description\" content=\"LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。\">\r\n");
      out.write("    <meta name=\"author\" content=\"yinqi\">\r\n");
      out.write("    <link href=\"../../css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../../css/materialdesignicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"../../css/style.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .lyear-wrapper {\r\n");
      out.write("            position: relative;\r\n");
      out.write("        }\r\n");
      out.write("        .lyear-login {\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 500px;\r\n");
      out.write("            margin: auto;\r\n");
      out.write("            display: flex !important;\r\n");
      out.write("            min-height: 100vh;\r\n");
      out.write("            align-items: center !important;\r\n");
      out.write("            justify-content: center !important;\r\n");
      out.write("        }\r\n");
      out.write("        .lyear-login:after{\r\n");
      out.write("            content: '';\r\n");
      out.write("            min-height: inherit;\r\n");
      out.write("            font-size: 0;\r\n");
      out.write("        }\r\n");
      out.write("        .login-center {\r\n");
      out.write("            background: #fff;\r\n");
      out.write("            min-width: 29.25rem;\r\n");
      out.write("            padding: 2.14286em 3.57143em;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            margin: 2.85714em;\r\n");
      out.write("        }\r\n");
      out.write("        .login-header {\r\n");
      out.write("            margin-bottom: 1.5rem !important;\r\n");
      out.write("        }\r\n");
      out.write("        .login-center .has-feedback.feedback-left .form-control {\r\n");
      out.write("            padding-left: 38px;\r\n");
      out.write("            padding-right: 12px;\r\n");
      out.write("        }\r\n");
      out.write("        .login-center .has-feedback.feedback-left .form-control-feedback {\r\n");
      out.write("            left: 0;\r\n");
      out.write("            right: auto;\r\n");
      out.write("            width: 38px;\r\n");
      out.write("            height: 38px;\r\n");
      out.write("            line-height: 38px;\r\n");
      out.write("            z-index: 4;\r\n");
      out.write("            color: #dcdcdc;\r\n");
      out.write("        }\r\n");
      out.write("        .login-center .has-feedback.feedback-left.row .form-control-feedback {\r\n");
      out.write("            left: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .logo {\r\n");
      out.write("            height: 80px;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .logo img {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            object-fit: contain;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body></body>\r\n");
      out.write("<div class=\"row lyear-wrapper\" style=\"background-image: url(https://jw.gdou.edu.cn/xtgl/dlycssz_cxDlycsszZp.html?zplx=3&t=1703579902954); background-size: cover;\">\r\n");
      out.write("    <div class=\"lyear-login\" style=\"background-color: #e1f1f6;\">\r\n");
      out.write("        <div class=\"login-header text-center\">\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <img src=\"https://www.gdou.edu.cn/img/logo1.png\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"login-center\">\r\n");
      out.write("                <h1>后台管理系统</h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <form action=\"login.action\" method=\"get\">\r\n");
      out.write("                <div class=\"form-group has-feedback feedback-left\">\r\n");
      out.write("                    <input type=\"text\" placeholder=\"请输入您的用户名\" class=\"form-control\" name=\"loginname\" id=\"loginname\" />\r\n");
      out.write("                    <span class=\"mdi mdi-account form-control-feedback\" aria-hidden=\"true\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group has-feedback feedback-left\">\r\n");
      out.write("                    <input type=\"password\" placeholder=\"请输入密码\" class=\"form-control\" id=\"password\" name=\"password\" />\r\n");
      out.write("                    <span class=\"mdi mdi-lock form-control-feedback\" aria-hidden=\"true\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group has-feedback feedback-left row\">\r\n");
      out.write("                    <div class=\"col-xs-7\">\r\n");
      out.write("                        <input  name=\"code\"  placeholder=\"验证码\"  class=\"form-control\">\r\n");
      out.write("                        <span class=\"mdi mdi-check-all form-control-feedback\" aria-hidden=\"true\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-xs-5\">\r\n");
      out.write("                        <img src=\"checkCode\" class=\"pull-right\" id=\"captcha\" style=\"cursor: pointer;\" onclick=\"changeCheckCode(this)\" title=\"点击刷新\" alt=\"captcha\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <button class=\"btn btn-block btn-primary\" type=\"submit\" id=\"login-submit-btn\" >立即登录</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    //图片点击事件\r\n");
      out.write("    function changeCheckCode(img) {\r\n");
      out.write("        img.src=\"checkCode?\"+new Date().getTime();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    $(function(){\r\n");
      out.write("        /** 按了回车键 */\r\n");
      out.write("        $(document).keydown(function(event){\r\n");
      out.write("            if(event.keyCode == 13){\r\n");
      out.write("                $(\"#login-submit-btn\").trigger(\"click\");\r\n");
      out.write("            }\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("        /** 给登录按钮绑定点击事件  */\r\n");
      out.write("        $(\"#login-submit-btn\").on(\"click\",function(){\r\n");
      out.write("            /** 校验登录参数 ctrl+K */\r\n");
      out.write("            var loginname = $(\"#loginname\").val();\r\n");
      out.write("            var password = $(\"#password\").val();\r\n");
      out.write("\r\n");
      out.write("            var msg = \"\";\r\n");
      out.write("\r\n");
      out.write("            if(!/^\\w{4,20}$/.test(loginname)){\r\n");
      out.write("                msg = \"登录名长度必须是4~20之间\";\r\n");
      out.write("            }else if(!/^\\w{4,20}$/.test(password)){\r\n");
      out.write("                msg = \"密码长度必须是4~20之间\";\r\n");
      out.write("            }\r\n");
      out.write("            if(msg !=\"\"){\r\n");
      out.write("                alert(msg);\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            /** 提交表单 */\r\n");
      out.write("            $(\"#loginForm\").submit();\r\n");
      out.write("\r\n");
      out.write("        })\r\n");
      out.write("\r\n");
      out.write("    })\r\n");
      out.write("</script >\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/taglib.jsp(4,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("ctx");
    // /WEB-INF/jsp/taglib.jsp(4,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/taglib.jsp(4,0) '${pageContext.servletContext.contextPath}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${pageContext.servletContext.contextPath}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
