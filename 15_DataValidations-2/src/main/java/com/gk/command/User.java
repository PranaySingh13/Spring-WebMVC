package com.gk.command;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class User {

	/*
	 * ****Note****
	 * IF we don't want to Provide validation messages through
	 * properties file. Provide validation messages directly in
	 * the Annotation..
	 */
	// @NotEmpty(message="User Name is required")
	@NotEmpty
	private String uName;

	@NotEmpty
	@Size(max = 10, min = 6)
	private String uPassword;

	@NotNull
	@Range(min = 18, max = 30)
	private int uAge;

	@NotNull
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past
	private Date uDob;

	@NotEmpty
	@Email
	private String uEmailId;

	@NotEmpty
	@Pattern(regexp = "91-[0-9]{10}")
	private String uMobile;

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public int getuAge() {
		return uAge;
	}

	public void setuAge(int uAge) {
		this.uAge = uAge;
	}

	public Date getuDob() {
		return uDob;
	}

	public void setuDob(Date uDob) {
		this.uDob = uDob;
	}

	public String getuEmailId() {
		return uEmailId;
	}

	public void setuEmailId(String uEmailId) {
		this.uEmailId = uEmailId;
	}

	public String getuMobile() {
		return uMobile;
	}

	public void setuMobile(String uMobile) {
		this.uMobile = uMobile;
	}
}
