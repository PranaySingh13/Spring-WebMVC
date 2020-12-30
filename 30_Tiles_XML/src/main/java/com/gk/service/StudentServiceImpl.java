package com.gk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gk.dao.StudentDao;
import com.gk.dto.Student;
import com.gk.entity.StudentEntity;

@Service(value = "studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Transactional
	@Override
	public String addStudent(Student student) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setsId(student.getsId());
		studentEntity.setsName(student.getsName());
		studentEntity.setsAddress(student.getsAddress());
		String status = studentDao.add(studentEntity);
		return status;
	}

	@Override
	public Student searchStudent(String sId) {
		StudentEntity studentEntity = studentDao.search(sId);
		Student student = null;
		if (studentEntity == null) {
			student = null;
		} else {
			student = new Student();
			student.setsId(studentEntity.getsId());
			student.setsName(studentEntity.getsName());
			student.setsAddress(studentEntity.getsAddress());
		}
		return student;
	}

	@Transactional
	@Override
	public String deleteStudent(String sId) {
		String status = studentDao.delete(sId);
		return status;
	}

}
