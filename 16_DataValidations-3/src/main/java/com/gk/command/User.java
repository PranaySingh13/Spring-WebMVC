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
	@NotEmpty(message="User Name is required")
	private String uName;

	@NotEmpty(message = "User Password is Required")
	@Size(max = 10, min = 6, message = "User Password must be minimum 6 and maximum 10 characters.")
	private String uPassword;

	@NotNull(message = "User Age is Required")
	@Range(min = 18, max = 30, message = "User Age must be minimum 18 and maximum 30")
	private int uAge;

	@NotNull(message = "User Date of Birth is Required")
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	@Past(message = "User DOB must be past date")
	private Date uDob;

	@NotEmpty(message = "User Email Id is Required")
	@Email
	private String uEmailId;

	@NotEmpty(message = "User Mobile No is Required")
	@Pattern(regexp = "91-[0-9]{10}", message = "User Mobile Number must be in 91-DDDDDDDDDD format")
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
