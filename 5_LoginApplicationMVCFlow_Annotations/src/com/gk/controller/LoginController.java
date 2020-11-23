package com.gk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("status")
public class LoginController {

	@RequestMapping(value = "/loginPage")
	public String loginPage() {
		return "loginForm";
	}

	@RequestMapping(value = "/login")
	public String login(@RequestParam("uname") String uname, @RequestParam("upwd") String upwd, ModelMap map) {
		String status = "";
		if (uname.equals("pranay") && upwd.equals("abc123")) {
			map.addAttribute("status", "Login Success");
		} else {
			map.addAttribute("status", "Login Failure");
		}

		return "status";
	}
}
