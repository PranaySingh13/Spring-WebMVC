package com.gk.dao;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.gk.dto.Student;

public class StudentDaoImpl extends JdbcDaoSupport implements StudentDao {

	String status = "";
	String query = "";

	@Override
	public String add(Student student) {
		query = "select * from STUDENT where SID ='" + student.getSid() + "'";
		List<Student> std_List = getJdbcTemplate().query(query, (resultSet, i) -> {
			Student std = new Student();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (std_List.isEmpty()) {
			query = "insert into STUDENT values('" + student.getSid() + "','" + student.getSname() + "','"
					+ student.getSaddr() + "')";
			int rowCount = getJdbcTemplate().update(query);
			if (rowCount == 1) {
				status = "Success";
			} else {
				status = "Failure";
			}
		} else {
			status = "Existed";
		}
		return status;
	}

	@Override
	public Student search(String sid) {
		Student student = null;
		query = "select * from STUDENT where SID ='" + sid + "'";
		List<Student> std_List = getJdbcTemplate().query(query, (resultSet, i) -> {
			Student std = new Student();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (std_List.isEmpty()) {
			student = null;
		} else {
			student = std_List.get(0);
		}
		return student;
	}

	@Override
	public String update(Student student) {
		query = "update STUDENT set SNAME='" + student.getSname() + "',SADDR='" + student.getSaddr() + "' where SID='"
				+ student.getSid() + "'";
		int rowCount = getJdbcTemplate().update(query);
		if (rowCount == 1) {
			status = "Success";
		} else {
			status = "Failure";
		}
		return status;
	}

	@Override
	public String delete(String sid) {
		query = "select * from STUDENT where SID ='" + sid + "'";
		List<Student> std_List = getJdbcTemplate().query(query, (resultSet, i) -> {
			Student std = new Student();
			std.setSid(resultSet.getString("SID"));
			std.setSname(resultSet.getString("SNAME"));
			std.setSaddr(resultSet.getString("SADDR"));
			return std;
		});
		if (std_List.isEmpty()) {
			status = "Not Existed";

		} else {
			query = "delete from STUDENT where SID='" + sid + "'";
			int rowCount = getJdbcTemplate().update(query);
			if (rowCount == 1) {
				status = "Success";
			} else {
				status = "Failure";
			}
		}
		return status;
	}

}
