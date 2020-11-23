package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		ModelAndView mv = null;
		if (uname.equals("Pranay") && upwd.equals("abc123")) {
			mv = new ModelAndView("Success");
		} else {
			mv = new ModelAndView("Failure");
		}
		return mv;
	}

}
