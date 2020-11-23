package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest response, HttpServletResponse request) throws Exception {
		ModelAndView mv = new ModelAndView("helloForm");
		return mv;
	}

}
