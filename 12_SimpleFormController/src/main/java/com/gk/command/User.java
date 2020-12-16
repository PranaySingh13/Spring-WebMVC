package com.gk.command;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String uName;
	private String uPassword;
	private boolean maritalStatus1;
	private String maritalStatus2;
	private String[] uQualifications;
	private String uGender;
	private String uWorkLocation;
	private String uSkillSet;
	private String[] uHobbies;
	private String uProfession;
	private String uAddress;
	
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
	public boolean isMaritalStatus1() {
		return maritalStatus1;
	}
	public void setMaritalStatus1(boolean maritalStatus1) {
		this.maritalStatus1 = maritalStatus1;
	}
	public String getMaritalStatus2() {
		return maritalStatus2;
	}
	public void setMaritalStatus2(String maritalStatus2) {
		this.maritalStatus2 = maritalStatus2;
	}
	public String[] getuQualifications() {
		return uQualifications;
	}
	public void setuQualifications(String[] uQualifications) {
		this.uQualifications = uQualifications;
	}
	public String getuGender() {
		return uGender;
	}
	public void setuGender(String uGender) {
		this.uGender = uGender;
	}
	public String getuWorkLocation() {
		return uWorkLocation;
	}
	public void setuWorkLocation(String uWorkLocation) {
		this.uWorkLocation = uWorkLocation;
	}
	public String getuSkillSet() {
		return uSkillSet;
	}
	public void setuSkillSet(String uSkillSet) {
		this.uSkillSet = uSkillSet;
	}
	public String[] getuHobbies() {
		return uHobbies;
	}
	public void setuHobbies(String[] uHobbies) {
		this.uHobbies = uHobbies;
	}
	public String getuProfession() {
		return uProfession;
	}
	public void setuProfession(String uProfession) {
		this.uProfession = uProfession;
	}
	public String getuAddress() {
		return uAddress;
	}
	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}
}
