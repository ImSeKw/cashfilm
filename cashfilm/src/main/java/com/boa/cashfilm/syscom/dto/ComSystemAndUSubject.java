package com.boa.cashfilm.syscom.dto;

public class ComSystemAndUSubject {
	private int userComSubjectCode;
	private int comSystemNumeral;
	private String comSystemName;
	private int comCode;
	private String userComSubjectName;
	private String memberEmail;
	private int userComSubjectNumeral;
	public int getUserComSubjectCode() {
		return userComSubjectCode;
	}
	public void setUserComSubjectCode(int userComSubjectCode) {
		this.userComSubjectCode = userComSubjectCode;
	}
	public int getComSystemNumeral() {
		return comSystemNumeral;
	}
	public void setComSystemNumeral(int comSystemNumeral) {
		this.comSystemNumeral = comSystemNumeral;
	}
	public String getComSystemName() {
		return comSystemName;
	}
	public void setComSystemName(String comSystemName) {
		this.comSystemName = comSystemName;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getUserComSubjectName() {
		return userComSubjectName;
	}
	public void setUserComSubjectName(String userComSubjectName) {
		this.userComSubjectName = userComSubjectName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getUserComSubjectNumeral() {
		return userComSubjectNumeral;
	}
	public void setUserComSubjectNumeral(int userComSubjectNumeral) {
		this.userComSubjectNumeral = userComSubjectNumeral;
	}
	@Override
	public String toString() {
		return "ComSystemAndUSubject [userComSubjectCode=" + userComSubjectCode + ", comSystemNumeral="
				+ comSystemNumeral + ", comSystemName=" + comSystemName + ", comCode=" + comCode
				+ ", userComSubjectName=" + userComSubjectName + ", memberEmail=" + memberEmail
				+ ", userComSubjectNumeral=" + userComSubjectNumeral + "]";
	}
	
	

}
