package com.one.utils;

import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ServletContextAware;

public class SpringContext implements ApplicationContextAware,
		ServletContextAware {

	private static ApplicationContext applicationContext;

	private static ServletContext servletContext;
	@Override
	public void setApplicationContext(ApplicationContext ac)
			throws BeansException {
		applicationContext = ac;
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static Object getBean(String name) {
		return applicationContext.getBean(name);
	}
	@Override
	public void setServletContext(ServletContext sc) {
		servletContext = sc;
	}

	public static ServletContext getServletContext() {
		return servletContext;
	}

	public static String getRealPath() {
		if (servletContext == null) {
			return System.getProperty("java.io.tmpdir");
		}
		return servletContext.getRealPath("/");
	}
}