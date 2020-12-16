package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractFormController;

import com.gk.command.Student;

/*
 * Deprecated from Spring 4.x version
 */

public class StudentController extends AbstractFormController {

	/*
	 * It will be executed when we submit POST request from the user form.
	 */
	@Override
	protected ModelAndView processFormSubmission(HttpServletRequest request, HttpServletResponse response,
			Object command, BindException errors) throws Exception {
		Student student = (Student) command;
		ModelAndView mv = new ModelAndView("registrationDetails", "student", student);
		return mv;
	}

	/*
	 * Method to prepare view name and it will be executed when we submitted GET
	 * request from client.
	 */
	@Override
	protected ModelAndView showForm(HttpServletRequest request, HttpServletResponse response, BindException errors)
			throws Exception {

		return new ModelAndView("registrationForm");
	}

}
