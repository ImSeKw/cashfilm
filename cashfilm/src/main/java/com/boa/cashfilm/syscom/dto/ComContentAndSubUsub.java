package com.boa.cashfilm.syscom.dto;

public class ComContentAndSubUsub {
	private int comContentCode;
	private int comSubjectNumeral;
	private String comSubjectName;
	private int userComSubjectCode;
	private String userComSubjectName;
	private String comContentName;
	private int comCode;
	private String memberEmail;
	private String comContentRegistrationDay;
	public int getComContentCode() {
		return comContentCode;
	}
	public void setComContentCode(int comContentCode) {
		this.comContentCode = comContentCode;
	}
	public int getComSubjectNumeral() {
		return comSubjectNumeral;
	}
	public void setComSubjectNumeral(int comSubjectNumeral) {
		this.comSubjectNumeral = comSubjectNumeral;
	}
	public String getComSubjectName() {
		return comSubjectName;
	}
	public void setComSubjectName(String comSubjectName) {
		this.comSubjectName = comSubjectName;
	}
	public int getUserComSubjectCode() {
		return userComSubjectCode;
	}
	public void setUserComSubjectCode(int userComSubjectCode) {
		this.userComSubjectCode = userComSubjectCode;
	}
	public String getUserComSubjectName() {
		return userComSubjectName;
	}
	public void setUserComSubjectName(String userComSubjectName) {
		this.userComSubjectName = userComSubjectName;
	}
	public String getComContentName() {
		return comContentName;
	}
	public void setComContentName(String comContentName) {
		this.comContentName = comContentName;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getComContentRegistrationDay() {
		return comContentRegistrationDay;
	}
	public void setComContentRegistrationDay(String comContentRegistrationDay) {
		this.comContentRegistrationDay = comContentRegistrationDay;
	}
	@Override
	public String toString() {
		return "ComContentAndSubUsub [comContentCode=" + comContentCode + ", comSubjectNumeral=" + comSubjectNumeral
				+ ", comSubjectName=" + comSubjectName + ", userComSubjectCode=" + userComSubjectCode
				+ ", userComSubjectName=" + userComSubjectName + ", comContentName=" + comContentName + ", comCode="
				+ comCode + ", memberEmail=" + memberEmail + ", comContentRegistrationDay=" + comContentRegistrationDay
				+ "]";
	}
	
	
	
}
