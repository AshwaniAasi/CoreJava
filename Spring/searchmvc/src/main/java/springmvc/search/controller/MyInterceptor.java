package springmvc.search.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter {


	/*
	// preHandler method will be run before the controller
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("this is preHanle method");
		// if we want to doesn't provide access of pre name
		String name= request.getParameter("user");
		if(name.startsWith("Pre")) {
			// to print msg on web page
			response.setContentType("text/html");
			response.getWriter().println("Invalid Name.. Pre name will not allowed");
			return false;
		}
		return true;
	}
	*/
	

	/*
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("this is postHandle method");
		// if we want to doesn't provide access of post name
				String name= request.getParameter("user");
				if(name.startsWith("Post"))	{
					// to print msg on web page
					response.setContentType("text/html");
					response.getWriter().println("Invalid Name.. Post name will not allowed");
				}
	}
	*/
	
	

	/*
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("this is afterCompletion method");
		super.afterCompletion(request, response, handler, ex);
	}
	*/
	
	

}
