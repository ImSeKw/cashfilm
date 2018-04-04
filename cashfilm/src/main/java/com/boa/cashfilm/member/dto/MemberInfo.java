package com.boa.cashfilm.member.dto;

public class MemberInfo {
	private String memberEmail;
	private String memberName;
	private String memberPassword;
	private String memberPhoneFirst;
	private String memberPhoneSecond;
	private String memberPostalCode;
	private String memberAddress;
	private String memberPhone;
	private String memberSignDay;
	private String memberClassificationName;
	private String comName;
	
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
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberSignDay() {
		return memberSignDay;
	}
	public void setMemberSignDay(String memberSignDay) {
		this.memberSignDay = memberSignDay;
	}
	public String getMemberClassificationName() {
		return memberClassificationName;
	}
	public void setMemberClassificationName(String memberClassificationName) {
		this.memberClassificationName = memberClassificationName;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	
	@Override
	public String toString() {
		return "MemberInfo [memberEmail=" + memberEmail + ", memberName=" + memberName + ", memberPassword="
				+ memberPassword + ", memberPhoneFirst=" + memberPhoneFirst + ", memberPhoneSecond=" + memberPhoneSecond
				+ ", memberPostalCode=" + memberPostalCode + ", memberAddress=" + memberAddress + ", memberPhone="
				+ memberPhone + ", memberSignDay=" + memberSignDay + ", memberClassificationName="
				+ memberClassificationName + ", comName=" + comName + "]";
	}
}
