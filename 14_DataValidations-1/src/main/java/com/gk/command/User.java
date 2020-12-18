package com.gk.command;

public class User {

	private String uName;
	private String uPassword;
	private int uAge;
	private String uEmailId;
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
