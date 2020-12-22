package com.gk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gk.command.Student;
import com.gk.exception.StudentMarksOutOfBoundException;

@Controller
public class StudentController {

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("studentForm", "student", new Student());
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView registration(Student student, ModelMap model) {
		if (student.getSmarks() < 0 || student.getSmarks() > 100) {
			throw new StudentMarksOutOfBoundException(
					"Invalid Student Marks,Please provide student marks between 0 and 100");
		}
		return new ModelAndView("studentDetails", "student", student);
	}

}
