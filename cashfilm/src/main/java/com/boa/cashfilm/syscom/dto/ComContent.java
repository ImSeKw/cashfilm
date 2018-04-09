package com.boa.cashfilm.syscom.dto;

public class ComContent {
	private int comContentCode;
	private int	comSubjectNumeral;
	private int userComSubjectCode;
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
	public int getUserComSubjectCode() {
		return userComSubjectCode;
	}
	public void setUserComSubjectCode(int userComSubjectCode) {
		this.userComSubjectCode = userComSubjectCode;
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
		return "ComContent [comContentCode=" + comContentCode + ", comSubjectNumeral=" + comSubjectNumeral
				+ ", userComSubjectCode=" + userComSubjectCode + ", comContentName=" + comContentName + ", comCode="
				+ comCode + ", memberEmail=" + memberEmail + ", comContentRegistrationDay=" + comContentRegistrationDay
				+ "]";
	}
	
	
}
