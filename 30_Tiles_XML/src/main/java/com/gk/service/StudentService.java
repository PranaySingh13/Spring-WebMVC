package com.gk.service;

import com.gk.dto.Student;

public interface StudentService {

	public String addStudent(Student student);

	public Student searchStudent(String sId);

	public String deleteStudent(String sId);

}
