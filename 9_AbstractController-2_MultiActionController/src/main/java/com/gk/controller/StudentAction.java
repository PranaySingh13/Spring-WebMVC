package com.gk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.gk.dao.StudentDao;
import com.gk.dto.Student;
/*
 * MultiActionController is deprecated from spring 4.x version
 */
public class StudentAction extends MultiActionController {

	StudentDao studentDao;
	
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	String status = "";
	String message = "";

	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Student student = new Student();
		student.setSid(request.getParameter("sid"));
		student.setSname(request.getParameter("sname"));
		student.setSaddr(request.getParameter("saddr"));
		status = studentDao.add(student);
		if (status.equals("Success")) {
			message = "Student Added Successfully";
		} else if (status.equals("Failure")) {
			message = "Student Insertion Failure";
		} else {
			message = "Student Existed Already";
		}
		return new ModelAndView("status", "message", message);
	}

	public ModelAndView search(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		Student student = studentDao.search(sid);
		ModelAndView mv = null;
		if (student == null) {
			mv = new ModelAndView("status", "message", "Student Not Existed");
		} else {
			mv = new ModelAndView("studentDetails", "stud", student);
		}
		return mv;
	}

	public ModelAndView edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		Student student = studentDao.search(sid);
		ModelAndView mv = null;
		if (student == null) {
			mv = new ModelAndView("status", "message", "Student Not Existed");
		} else {
			mv = new ModelAndView("editForm", "stud", student);
		}
		return mv;
	}

	public ModelAndView update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Student student = new Student();
		student.setSid(request.getParameter("sid"));
		student.setSname(request.getParameter("sname"));
		student.setSaddr(request.getParameter("saddr"));
		status = studentDao.update(student);
		ModelAndView mv = null;
		if (status.equals("Success")) {
			mv = new ModelAndView("status", "message", "Student Updation Successfully");
		} else {
			mv = new ModelAndView("status", "message", "Student Updation Failure");
		}
		return mv;
	}

	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String sid = request.getParameter("sid");
		ModelAndView mv = null;
		status = studentDao.delete(sid);
		if (status.equals("Success")) {
			mv = new ModelAndView("status", "message", "Student Deleted Successfully");
		} else if (status.equals("Failure")) {
			mv = new ModelAndView("status", "message", "Student Deletion Failure");
		} else {
			mv = new ModelAndView("status", "message", "Student Not Existed");
		}
		return mv;
	}

}
