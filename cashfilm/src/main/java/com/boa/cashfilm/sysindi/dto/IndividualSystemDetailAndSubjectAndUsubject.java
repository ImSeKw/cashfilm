package com.boa.cashfilm.sysindi.dto;

public class IndividualSystemDetailAndSubjectAndUsubject {
	private int individualSystemDetailCode;
	private int individualSubjectNumeral;
	private String individualSubjectName;
	private int userIndividualSubjectCode;
	private String userIndividualSubjectName;
	private String individualSystemDetailName;
	private String memberEmail;
	public int getIndividualSystemDetailCode() {
		return individualSystemDetailCode;
	}
	public void setIndividualSystemDetailCode(int individualSystemDetailCode) {
		this.individualSystemDetailCode = individualSystemDetailCode;
	}
	public int getIndividualSubjectNumeral() {
		return individualSubjectNumeral;
	}
	public void setIndividualSubjectNumeral(int individualSubjectNumeral) {
		this.individualSubjectNumeral = individualSubjectNumeral;
	}
	public String getIndividualSubjectName() {
		return individualSubjectName;
	}
	public void setIndividualSubjectName(String individualSubjectName) {
		this.individualSubjectName = individualSubjectName;
	}
	public int getUserIndividualSubjectCode() {
		return userIndividualSubjectCode;
	}
	public void setUserIndividualSubjectCode(int userIndividualSubjectCode) {
		this.userIndividualSubjectCode = userIndividualSubjectCode;
	}
	public String getUserIndividualSubjectName() {
		return userIndividualSubjectName;
	}
	public void setUserIndividualSubjectName(String userIndividualSubjectName) {
		this.userIndividualSubjectName = userIndividualSubjectName;
	}
	public String getIndividualSystemDetailName() {
		return individualSystemDetailName;
	}
	public void setIndividualSystemDetailName(String individualSystemDetailName) {
		this.individualSystemDetailName = individualSystemDetailName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	@Override
	public String toString() {
		return "IndividualSystemDetailAndSubjectAndUsubject [individualSystemDetailCode=" + individualSystemDetailCode
				+ ", individualSubjectNumeral=" + individualSubjectNumeral + ", individualSubjectName="
				+ individualSubjectName + ", userIndividualSubjectCode=" + userIndividualSubjectCode
				+ ", userIndividualSubjectName=" + userIndividualSubjectName + ", individualSystemDetailName="
				+ individualSystemDetailName + ", memberEmail=" + memberEmail + "]";
	}
	
}