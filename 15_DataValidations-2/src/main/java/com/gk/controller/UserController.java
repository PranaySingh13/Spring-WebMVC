package com.gk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gk.command.User;

@Controller
@RequestMapping(value = "/reg")
public class UserController {

	@RequestMapping(method = RequestMethod.GET)
	public String showPage(Model model) {
		model.addAttribute("user", new User());
		return "registrationForm";
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registration(@Valid User user, BindingResult result, Model model) {
		model.addAttribute("user", user);
		if (result.hasErrors()) {
			return new ModelAndView("registrationForm", "user", user);
		} else {
			return new ModelAndView("registrationDetails", "user", user);
		}
	}
}
