/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-12-26 10:14:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header class=\"lyear-layout-header\">\r\n");
      out.write("\r\n");
      out.write("    <nav class=\"navbar navbar-default\">\r\n");
      out.write("        <div class=\"topbar\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"topbar-left\">\r\n");
      out.write("                <div class=\"lyear-aside-toggler\">\r\n");
      out.write("                    <span class=\"lyear-toggler-bar\"></span>\r\n");
      out.write("                    <span class=\"lyear-toggler-bar\"></span>\r\n");
      out.write("                    <span class=\"lyear-toggler-bar\"></span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"navbar-page-title\"> 后台首页 </span>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"topbar-right\">\r\n");
      out.write("                <li class=\"dropdown dropdown-profile\">\r\n");
      out.write("                    <a href=\"javascript:void(0)\" data-toggle=\"dropdown\">\r\n");
      out.write("                        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_inf.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" <span class=\"caret\"></span></span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-right\">\r\n");
      out.write("                        <li> <a href=\"lyear_pages_profile.html\"><i class=\"mdi mdi-account\"></i> 个人信息</a> </li>\r\n");
      out.write("                        <li> <a href=\"lyear_pages_edit_pwd.html\"><i class=\"mdi mdi-lock-outline\"></i> 修改密码</a> </li>\r\n");
      out.write("                        <li> <a href=\"javascript:void(0)\"><i class=\"mdi mdi-delete\"></i> 清空缓存</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ctx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/logout.action\"><i class=\"mdi mdi-logout-variant\"></i> 退出登录</a> </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--切换主题配色-->\r\n");
      out.write("                <li class=\"dropdown dropdown-skin\">\r\n");
      out.write("                    <span data-toggle=\"dropdown\" class=\"icon-palette\"><i class=\"mdi mdi-palette\"></i></span>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-right\" data-stopPropagation=\"true\">\r\n");
      out.write("                        <li class=\"drop-title\"><p>主题</p></li>\r\n");
      out.write("                        <li class=\"drop-skin-li clearfix\">\r\n");
      out.write("                  <span class=\"inverse\">\r\n");
      out.write("                    <input type=\"radio\" name=\"site_theme\" value=\"default\" id=\"site_theme_1\" checked>\r\n");
      out.write("                    <label for=\"site_theme_1\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"site_theme\" value=\"dark\" id=\"site_theme_2\">\r\n");
      out.write("                    <label for=\"site_theme_2\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"site_theme\" value=\"translucent\" id=\"site_theme_3\">\r\n");
      out.write("                    <label for=\"site_theme_3\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"drop-title\"><p>LOGO</p></li>\r\n");
      out.write("                        <li class=\"drop-skin-li clearfix\">\r\n");
      out.write("                  <span class=\"inverse\">\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"default\" id=\"logo_bg_1\" checked>\r\n");
      out.write("                    <label for=\"logo_bg_1\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_2\" id=\"logo_bg_2\">\r\n");
      out.write("                    <label for=\"logo_bg_2\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_3\" id=\"logo_bg_3\">\r\n");
      out.write("                    <label for=\"logo_bg_3\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_4\" id=\"logo_bg_4\">\r\n");
      out.write("                    <label for=\"logo_bg_4\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_5\" id=\"logo_bg_5\">\r\n");
      out.write("                    <label for=\"logo_bg_5\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_6\" id=\"logo_bg_6\">\r\n");
      out.write("                    <label for=\"logo_bg_6\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_7\" id=\"logo_bg_7\">\r\n");
      out.write("                    <label for=\"logo_bg_7\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"logo_bg\" value=\"color_8\" id=\"logo_bg_8\">\r\n");
      out.write("                    <label for=\"logo_bg_8\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"drop-title\"><p>头部</p></li>\r\n");
      out.write("                        <li class=\"drop-skin-li clearfix\">\r\n");
      out.write("                  <span class=\"inverse\">\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"default\" id=\"header_bg_1\" checked>\r\n");
      out.write("                    <label for=\"header_bg_1\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_2\" id=\"header_bg_2\">\r\n");
      out.write("                    <label for=\"header_bg_2\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_3\" id=\"header_bg_3\">\r\n");
      out.write("                    <label for=\"header_bg_3\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_4\" id=\"header_bg_4\">\r\n");
      out.write("                    <label for=\"header_bg_4\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_5\" id=\"header_bg_5\">\r\n");
      out.write("                    <label for=\"header_bg_5\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_6\" id=\"header_bg_6\">\r\n");
      out.write("                    <label for=\"header_bg_6\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_7\" id=\"header_bg_7\">\r\n");
      out.write("                    <label for=\"header_bg_7\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"header_bg\" value=\"color_8\" id=\"header_bg_8\">\r\n");
      out.write("                    <label for=\"header_bg_8\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"drop-title\"><p>侧边栏</p></li>\r\n");
      out.write("                        <li class=\"drop-skin-li clearfix\">\r\n");
      out.write("                  <span class=\"inverse\">\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"default\" id=\"sidebar_bg_1\" checked>\r\n");
      out.write("                    <label for=\"sidebar_bg_1\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_2\" id=\"sidebar_bg_2\">\r\n");
      out.write("                    <label for=\"sidebar_bg_2\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_3\" id=\"sidebar_bg_3\">\r\n");
      out.write("                    <label for=\"sidebar_bg_3\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_4\" id=\"sidebar_bg_4\">\r\n");
      out.write("                    <label for=\"sidebar_bg_4\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_5\" id=\"sidebar_bg_5\">\r\n");
      out.write("                    <label for=\"sidebar_bg_5\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_6\" id=\"sidebar_bg_6\">\r\n");
      out.write("                    <label for=\"sidebar_bg_6\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_7\" id=\"sidebar_bg_7\">\r\n");
      out.write("                    <label for=\"sidebar_bg_7\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                            <span>\r\n");
      out.write("                    <input type=\"radio\" name=\"sidebar_bg\" value=\"color_8\" id=\"sidebar_bg_8\">\r\n");
      out.write("                    <label for=\"sidebar_bg_8\"></label>\r\n");
      out.write("                  </span>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <!--切换主题配色-->\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
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
