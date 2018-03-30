package com.boa.cashfilm.sysindi.dto;

public class UserIndividualSubject {
	
	private int userIndividualSubjectCode;
	private int individualSystemNumeral;
	private String userIndividualSubjectName;
	private String memberEmail;
	private int userIndividualSubjectNumeral;
	
	public int getUserIndividualSubjectCode() {
		return userIndividualSubjectCode;
	}
	public void setUserIndividualSubjectCode(int userIndividualSubjectCode) {
		this.userIndividualSubjectCode = userIndividualSubjectCode;
	}
	public int getIndividualSystemNumeral() {
		return individualSystemNumeral;
	}
	public void setIndividualSystemNumeral(int individualSystemNumeral) {
		this.individualSystemNumeral = individualSystemNumeral;
	}
	public String getUserIndividualSubjectName() {
		return userIndividualSubjectName;
	}
	public void setUserIndividualSubjectName(String userIndividualSubjectName) {
		this.userIndividualSubjectName = userIndividualSubjectName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getUserIndividualSubjectNumeral() {
		return userIndividualSubjectNumeral;
	}
	public void setUserIndividualSubjectNumeral(int userIndividualSubjectNumeral) {
		this.userIndividualSubjectNumeral = userIndividualSubjectNumeral;
	}
	@Override
	public String toString() {
		return "UserIndividualSubject [userIndividualSubjectCode=" + userIndividualSubjectCode
				+ ", individualSystemNumeral=" + individualSystemNumeral + ", userIndividualSubjectName="
				+ userIndividualSubjectName + ", memberEmail=" + memberEmail + ", userIndividualSubjectNumeral="
				+ userIndividualSubjectNumeral + "]";
	}
	
	
}
