package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class WishController {

	@RequestMapping(method = RequestMethod.GET)
	public String getForm() {
		return "helloform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView wish(HttpServletRequest request, HttpServletResponse response) {
		String uName = request.getParameter("uName");
		return new ModelAndView("wish", "uname", uName);
	}
}
