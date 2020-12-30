package com.gk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gk.dto.Student;
import com.gk.entity.StudentEntity;

@Repository(value = "studentDao")
public class StudentDaoImpl implements StudentDao {

	String status = "";

	@Autowired
	private HibernateTemplate template;

	@Override
	public String add(StudentEntity studentEntity) {
		try {
			StudentEntity std = (StudentEntity) template.get(StudentEntity.class, studentEntity.getsId());
			if (std == null) {
				String primarykey_Value = (String) template.save(studentEntity);
				if (primarykey_Value.equals(studentEntity.getsId())) {
					status = "Student Inserted Successfully";
				} else {
					status = "Student Insertion Failure";
				}
			} else {
				status = "Student Existed Already";
			}
		} catch (Exception e) {
			status = "Student Insertion Failure";
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public StudentEntity search(String sId) {
		StudentEntity stdEntity = null;
		try {
			stdEntity = (StudentEntity) template.get(StudentEntity.class, sId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stdEntity;
	}

	@Override
	public String delete(String sId) {
		try {
			StudentEntity stdEntity = template.get(StudentEntity.class, sId);
			if (stdEntity == null) {
				status = "Student Not Existed";
			} else {
				template.delete(stdEntity);
				status = "Student Deleted Successfully";
			}
		} catch (Exception e) {
			status = "Student Deletion Failure";
			e.printStackTrace();
		}
		return status;
	}

}
