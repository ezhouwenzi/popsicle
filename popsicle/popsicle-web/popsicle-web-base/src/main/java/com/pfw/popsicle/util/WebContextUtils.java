package com.pfw.popsicle.util;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class WebContextUtils {

	public static HttpServletRequest getRequest(){
		return ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
	}
}
