package com.gec.hrmsys.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 针对url后缀为action的地址进行过滤 针对两个资源，过滤器不需要拦截 a、跳转到登录页Servlet b、登录验证Servlet
 * 
 */
@WebFilter("*.action")
public class AuthorizedFilter implements Filter {

	String noFilterUrls[] = new String[] { "/tologinform.action", "/login.action" };

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		//设置post全局utf-8编码
		httpRequest.setCharacterEncoding("UTF-8");
		//获取请求路径
		String servletPath = httpRequest.getServletPath();
		boolean isFilter = true;
		for (String noFilterUrl : noFilterUrls) {
			if (noFilterUrl.equals(servletPath)) {
				//如果匹配到 则变为false 不是来登录页面的
				isFilter = false;
			}
		}
		if (isFilter) {
			// 请求路径不是登录页面,那么通过session判断是否已经登陆过
			HttpSession session = httpRequest.getSession(false);
			if (session != null && session.getAttribute("user_inf") != null) {
				System.out.println("filter action");
				chain.doFilter(request, response);
			} else {
				// 返回登录页
				httpResponse.sendRedirect(httpRequest.getServletContext().getContextPath() + "/tologinform.action");
			}
		} else {
			// 如果是访问登录请求路径 ,可以访问目标组件
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {

	}

}