package com.gk.command;

public class User {

	private String uFirstName;
	private String uLastName;
	private String uQualification;
	private String uDesignation;
	private String uEmailId;
	private String uMobile;
	
	public String getuFirstName() {
		return uFirstName;
	}
	public void setuFirstName(String uFirstName) {
		this.uFirstName = uFirstName;
	}
	public String getuLastName() {
		return uLastName;
	}
	public void setuLastName(String uLastName) {
		this.uLastName = uLastName;
	}
	public String getuQualification() {
		return uQualification;
	}
	public void setuQualification(String uQualification) {
		this.uQualification = uQualification;
	}
	public String getuDesignation() {
		return uDesignation;
	}
	public void setuDesignation(String uDesignation) {
		this.uDesignation = uDesignation;
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
