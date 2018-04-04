package com.boa.cashfilm.member.dto;

public class MemberSignUp {
	private String memberEmail;
	private String memberName;
	private String memberPassword;
	private String memberPhoneFirst;
	private String memberPhoneSecond;
	private String memberPostalCode;
	private String memberAddress;
	private int memberCertification;
	private String memberPhone;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberPhoneFirst() {
		return memberPhoneFirst;
	}
	public void setMemberPhoneFirst(String memberPhoneFirst) {
		this.memberPhoneFirst = memberPhoneFirst;
	}
	public String getMemberPhoneSecond() {
		return memberPhoneSecond;
	}
	public void setMemberPhoneSecond(String memberPhoneSecond) {
		this.memberPhoneSecond = memberPhoneSecond;
	}
	public String getMemberPostalCode() {
		return memberPostalCode;
	}
	public void setMemberPostalCode(String memberPostalCode) {
		this.memberPostalCode = memberPostalCode;
	}
	public String getMemberAddress() {
		return memberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	public int getMemberCertification() {
		return memberCertification;
	}
	public void setMemberCertification(int memberCertification) {
		this.memberCertification = memberCertification;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	
	@Override
	public String toString() {
		return "MemberSignUp [memberEmail=" + memberEmail + ", memberName=" + memberName + ", memberPassword="
				+ memberPassword + ", memberPhoneFirst=" + memberPhoneFirst + ", memberPhoneSecond=" + memberPhoneSecond
				+ ", memberPostalCode=" + memberPostalCode + ", memberAddress=" + memberAddress
				+ ", memberCertification=" + memberCertification + ", memberPhone=" + memberPhone + "]";
	}
}
