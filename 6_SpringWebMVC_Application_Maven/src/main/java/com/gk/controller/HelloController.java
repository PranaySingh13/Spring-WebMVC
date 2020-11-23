package com.gk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping(value = "/helloPage")
	public String helloPage() {
		return "helloForm";
	}

	/*
	 * Note: It is not mandatory to return ModelAndView object from controller
	 * method, where we can return String also but the parameter to Controller
	 * Method must be ModelMap, it will take model attributes which we want to
	 * submit to View JSP page.
	 */
	
	@RequestMapping(value = "/wish")
	public String wish(@RequestParam(value = "uname") String uname, ModelMap map) {
		map.addAttribute("message", "Hello !" + uname);
		return "wish";
	}
}
