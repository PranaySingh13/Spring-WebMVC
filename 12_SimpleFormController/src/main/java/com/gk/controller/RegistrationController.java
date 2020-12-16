package com.gk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.gk.command.User;

public class RegistrationController extends SimpleFormController {

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String, Object> map = new HashMap<>();

		List<String> qList = new ArrayList<>();
		qList.add("BE");
		qList.add("BTech");
		qList.add("ME");
		qList.add("MTech");
		qList.add("PHD");
		map.put("qual_List", qList);

		List<String> uWorkLocationList = new ArrayList<>();
		uWorkLocationList.add("Indore");
		uWorkLocationList.add("Pune");
		uWorkLocationList.add("Mumbai");
		uWorkLocationList.add("Delhi");
		map.put("uWorkLocation_List", uWorkLocationList);

		Map<String, String> uHobbies = new HashMap<>();
		uHobbies.put("Playing VolleyBall", "Playing VolleyBall");
		uHobbies.put("Listening Music", "Listening Music");
		uHobbies.put("Learnings", "Learnings");
		map.put("uHobbies", uHobbies);

		Map<String, String> uProfession = new HashMap<>();
		uProfession.put("Doctor", "Doctor");
		uProfession.put("Engineer", "Engineer");
		uProfession.put("Lawyer", "Lawyer");
		map.put("uProfession", uProfession);
		return map;
	}

	@Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User) command;
		return new ModelAndView("status", "user", user);
	}

}
