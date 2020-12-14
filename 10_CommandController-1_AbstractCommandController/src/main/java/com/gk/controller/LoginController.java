package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.gk.command.User;

/*
 * Deprecated from spring 4.x version
 */
public class LoginController extends AbstractCommandController {

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		User user = (User) command;
		String uname = user.getUname();
		String upwd = user.getUpwd();
		ModelAndView mv = null;
		if (uname.equals("pranay") && upwd.equals("abc123")) {
			mv = new ModelAndView("status", "message", "User Login Success");
		} else {
			mv = new ModelAndView("status", "message", "User Login Failure");
		}
		return mv;
	}

}
