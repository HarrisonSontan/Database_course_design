/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-12-26 06:49:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class empadd_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/jsp/taglib.jsp", Long.valueOf(1702297495582L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" />\r\n");
      out.write("\t<title>文档列表 - 光年(Light Year Admin)后台管理系统模板</title>\r\n");
      out.write("\t<link rel=\"icon\" href=\"favicon.ico\" type=\"image/ico\">\r\n");
      out.write("\t<meta name=\"keywords\" content=\"LightYear,光年,后台模板,后台管理系统,光年HTML模板\">\r\n");
      out.write("\t<meta name=\"description\" content=\"LightYear是一个基于Bootstrap v3.3.7的后台管理系统的HTML模板。\">\r\n");
      out.write("\t<meta name=\"author\" content=\"yinqi\">\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/materialdesignicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href=\"css/style.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<!--时间选择插件-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"js/bootstrap-datetimepicker/bootstrap-datetimepicker.min.css\">\r\n");
      out.write("\t<!--日期选择插件-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"js/bootstrap-datepicker/bootstrap-datepicker3.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"lyear-layout-web\">\r\n");
      out.write("\t<div class=\"lyear-layout-container\">\r\n");
      out.write("\t\t<!--左侧导航-->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../left.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!--End 左侧导航-->\r\n");
      out.write("\r\n");
      out.write("\t\t<!--头部信息-->\r\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t<!--页面主要内容-->\r\n");
      out.write("\t\t<main class=\"lyear-layout-content\">\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-24\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"card\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-header\"><h4>用户添加</h4></div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-horizontal\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/empaddsave.action\" method=\"get\" enctype=\"multipart/form-data\" >\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"username\">姓名</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"username\" name=\"name\" placeholder=\"姓名..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block\">输入更多信息</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"cardId\">身份证号</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"cardId\" name=\"cardId\" placeholder=\"身份证号..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"help-block\"  id=\"cardmsgid\"> 填写正确的15位或18位身份证号</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"example-select\">性别</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"example-select\" name=\"sex\" size=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">--请选择性别--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">女</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"job_id\">职位</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"job_id\" name=\"job_id\" size=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">--请选择职位--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"education\">学历</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"education\" name=\"education\" placeholder=\"学历..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"email\">邮箱</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"email\" name=\"email\" placeholder=\"邮箱..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"phone\">手机</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"phone\" name=\"phone\" placeholder=\"手机..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"tel\">电话</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"tel\" name=\"tel\" placeholder=\"电话..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"party\">政治面貌</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"party\" name=\"party\" placeholder=\"政治面貌..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"qqNum\">QQ号码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"qqNum\" name=\"qqNum\" placeholder=\"QQ号码..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"address\">联系地址</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"address\" name=\"address\" placeholder=\"联系地址..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"postCode\">邮政编码</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"postCode\" name=\"postCode\" placeholder=\"邮政编码..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"birthday\">出生日期</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"race\">民族</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"race\" name=\"race\" placeholder=\"民族..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"speciality\">所学专业</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"speciality\" name=\"speciality\" placeholder=\"所学专业..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"hobby\">爱好</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"hobby\" name=\"hobby\" placeholder=\"爱好..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"remark\">备注</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"remark\" name=\"remark\" placeholder=\"备注..\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-xs-12\" for=\"dept_id\">所属部门</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-4\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<select class=\"form-control\" id=\"dept_id\" name=\"dept_id\" size=\"1\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">--请选择部门--</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-xs-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"btn btn-primary\" type=\"submit\">提交</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</main>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/perfect-scrollbar.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/main.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--时间选择插件-->\r\n");
      out.write("<script src=\"js/bootstrap-datetimepicker/moment.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap-datetimepicker/bootstrap-datetimepicker.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap-datetimepicker/locale/zh-cn.js\"></script>\r\n");
      out.write("<!--日期选择插件-->\r\n");
      out.write("<script src=\"js/bootstrap-datepicker/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap-datepicker/locales/bootstrap-datepicker.zh-CN.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t$(function()\r\n");
      out.write("\t{\r\n");
      out.write("\t\t$(\"#cardId\").blur(function(){\r\n");
      out.write("\t\t\tvar cid =$(\"#cardId\").val();\r\n");
      out.write("\t\t\tvar regIdNo = /(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)/;\r\n");
      out.write("\t\t\tif (regIdNo.test(cid)) {\r\n");
      out.write("\t\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t\turl:\"getcardid.action\",// 发送请求的URL字符串。\r\n");
      out.write("\t\t\t\t\tdataType : \"json\", // 预期服务器返回的数据类型。\r\n");
      out.write("\t\t\t\t\ttype : \"post\", //  请求方式 POST或GET\r\n");
      out.write("\t\t\t\t\tcontentType:\"application/json\", //  发送信息至服务器时的内容编码类型\r\n");
      out.write("\t\t\t\t\t// 发送到服务器的数据。\r\n");
      out.write("\t\t\t\t\tdata:JSON.stringify({cardId : cid}),\r\n");
      out.write("\t\t\t\t\tasync:  true , // 默认设置下，所有请求均为异步请求。如果设置为false，则发送同步请求\r\n");
      out.write("\t\t\t\t\t// 请求成功后的回调函数。\r\n");
      out.write("\t\t\t\t\tsuccess :function(data){\r\n");
      out.write("\t\t\t\t\t\tif(data)\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#cardmsgid\").html('身份证验证成功');\r\n");
      out.write("\t\t\t\t\t\t}else\r\n");
      out.write("\t\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\t\t$(\"#cardmsgid\").html('<span style=\"color:red\">身份证已经存在，请重新输入！</span>');\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t// 请求出错时调用的函数\r\n");
      out.write("\t\t\t\t\terror:function(){\r\n");
      out.write("\t\t\t\t\t\talert(\"数据发送失败\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\t$(\"#cardmsgid\").html('请输入正确的15位或18位身份证号');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//异步请求\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/jsp/employee/empadd.jsp(76,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/employee/empadd.jsp(76,12) '${requestScope.jobList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.jobList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/employee/empadd.jsp(76,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("job");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${job.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/jsp/employee/empadd.jsp(170,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/employee/empadd.jsp(170,12) '${requestScope.deptList}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.deptList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/employee/empadd.jsp(170,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("dept");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dept.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dept.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}