package com.boa.cashfilm.sysindi.dto;

public class Individualcontent {
	
	private int individualContentCode;
	private int individualSubjectNumeral;
	private int userIndividualSubjectCode;
	private String individualContentName;
	private String memberEmail;
	private String intindividualContentRegistrationDay;
	/**
	 * @return the individualContentCode
	 */
	public int getIndividualContentCode() {
		return individualContentCode;
	}
	/**
	 * @param individualContentCode the individualContentCode to set
	 */
	public void setIndividualContentCode(int individualContentCode) {
		this.individualContentCode = individualContentCode;
	}
	/**
	 * @return the individualSubjectNumeral
	 */
	public int getIndividualSubjectNumeral() {
		return individualSubjectNumeral;
	}
	/**
	 * @param individualSubjectNumeral the individualSubjectNumeral to set
	 */
	public void setIndividualSubjectNumeral(int individualSubjectNumeral) {
		this.individualSubjectNumeral = individualSubjectNumeral;
	}
	/**
	 * @return the userIndividualSubjectCode
	 */
	public int getUserIndividualSubjectCode() {
		return userIndividualSubjectCode;
	}
	/**
	 * @param userIndividualSubjectCode the userIndividualSubjectCode to set
	 */
	public void setUserIndividualSubjectCode(int userIndividualSubjectCode) {
		this.userIndividualSubjectCode = userIndividualSubjectCode;
	}
	/**
	 * @return the individualContentName
	 */
	public String getIndividualContentName() {
		return individualContentName;
	}
	/**
	 * @param individualContentName the individualContentName to set
	 */
	public void setIndividualContentName(String individualContentName) {
		this.individualContentName = individualContentName;
	}
	/**
	 * @return the memberEmail
	 */
	public String getMemberEmail() {
		return memberEmail;
	}
	/**
	 * @param memberEmail the memberEmail to set
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	/**
	 * @return the intindividualContentRegistrationDay
	 */
	public String getIntindividualContentRegistrationDay() {
		return intindividualContentRegistrationDay;
	}
	/**
	 * @param intindividualContentRegistrationDay the intindividualContentRegistrationDay to set
	 */
	public void setIntindividualContentRegistrationDay(String intindividualContentRegistrationDay) {
		this.intindividualContentRegistrationDay = intindividualContentRegistrationDay;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Individualcontent [individualContentCode=" + individualContentCode + ", individualSubjectNumeral="
				+ individualSubjectNumeral + ", userIndividualSubjectCode=" + userIndividualSubjectCode
				+ ", individualContentName=" + individualContentName + ", memberEmail=" + memberEmail
				+ ", intindividualContentRegistrationDay=" + intindividualContentRegistrationDay + "]";
	}
	
	
}
