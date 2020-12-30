package com.gk.dao;

import com.gk.entity.StudentEntity;

public interface StudentDao {

	public String add(StudentEntity studentEntity);

	public StudentEntity search(String sId);

	public String delete(String sId);
}
