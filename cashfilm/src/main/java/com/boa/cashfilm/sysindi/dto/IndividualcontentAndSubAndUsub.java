package com.boa.cashfilm.sysindi.dto;

public class IndividualcontentAndSubAndUsub {
	private int individualContentCode;
	private int individualSubjectNumeral;
	private String individualSubjectName;
	private int userIndividualSubjectCode;
	private String userIndividualSubjectName;
	private String individualContentName;
	private String memberEmail;
	private String individualContentRegistrationDay;
	public int getIndividualContentCode() {
		return individualContentCode;
	}
	public void setIndividualContentCode(int individualContentCode) {
		this.individualContentCode = individualContentCode;
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
	public String getIndividualContentName() {
		return individualContentName;
	}
	public void setIndividualContentName(String individualContentName) {
		this.individualContentName = individualContentName;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getIndividualContentRegistrationDay() {
		return individualContentRegistrationDay;
	}
	public void setIndividualContentRegistrationDay(String individualContentRegistrationDay) {
		this.individualContentRegistrationDay = individualContentRegistrationDay;
	}
	@Override
	public String toString() {
		return "IndividualcontentAndSubAndUsub [individualContentCode=" + individualContentCode
				+ ", individualSubjectNumeral=" + individualSubjectNumeral + ", individualSubjectName="
				+ individualSubjectName + ", userIndividualSubjectCode=" + userIndividualSubjectCode
				+ ", userIndividualSubjectName=" + userIndividualSubjectName + ", individualContentName="
				+ individualContentName + ", memberEmail=" + memberEmail + ", individualContentRegistrationDay="
				+ individualContentRegistrationDay + "]";
	}
	
	

}
