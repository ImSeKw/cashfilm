package com.boa.cashfilm.sysindi.dto;

public class IndividualSystemDetail {
	private int individualSystemDetailCode;
	private int individualSubjectNumeral;
	private int individualUserSubjecCode;
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
	public int getIndividualUserSubjecCode() {
		return individualUserSubjecCode;
	}
	public void setIndividualUserSubjecCode(int individualUserSubjecCode) {
		this.individualUserSubjecCode = individualUserSubjecCode;
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
		return "IndividualSystemDetail [individualSystemDetailCode=" + individualSystemDetailCode
				+ ", individualSubjectNumeral=" + individualSubjectNumeral + ", individualUserSubjecCode="
				+ individualUserSubjecCode + ", individualSystemDetailName=" + individualSystemDetailName
				+ ", memberEmail=" + memberEmail + "]";
	}
	
	

}
