package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.gk.command.User;
/*
 * Deprecated from Spring 3.x version
 */
public class UserController extends AbstractWizardFormController {

	/*
	 * It Will handle Wizard Finish Button.
	 */
	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		User user= (User)command;
		return new ModelAndView("userDetails", "user", user);
	}
	
	/*
	 * It will handle Wizard Cancel Button.
	 */
	@Override
		protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
				BindException errors) throws Exception {
			return new ModelAndView("welcomepage");
		}

}
