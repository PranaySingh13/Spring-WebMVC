package com.gk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gk.dto.Student;
import com.gk.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	/*
	 * Welcome Page Operation
	 */
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return "welcomeDef";
	}

	/*
	 * Add Operation
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addStudent() {
		return new ModelAndView("addDef", "student", new Student());
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add(Student student) {
		String status = studentService.addStudent(student);
		return new ModelAndView("statusDef", "status", status);
	}

	/*
	 * Search Operation
	 */
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchStudent() {
		return new ModelAndView("searchDef", "student", new Student());
	}

	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(Student student) {
		Student std = studentService.searchStudent(student.getsId());
		if (std == null) {
			return new ModelAndView("statusDef", "status", "Student Not Existed");
		} else {
			return new ModelAndView("studentDetailsDef", "student", std);
		}
	}

	/*
	 * Delete Operation
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView deleteStudent() {
		return new ModelAndView("deleteDef", "student", new Student());
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public ModelAndView delete(Student student) {
		String status = studentService.deleteStudent(student.getsId());
		return new ModelAndView("statusDef", "status", status);
	}
}
