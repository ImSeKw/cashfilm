package com.boa.cashfilm.member.dto;

public class MemberSimple {
	private String memberEmail;
	private int memberClassificationCode;
	private int comCode;
	private String memberName;
	private String memberPassword;
	private String memberCondition;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getMemberClassificationCode() {
		return memberClassificationCode;
	}
	public void setMemberClassificationCode(int memberClassificationCode) {
		this.memberClassificationCode = memberClassificationCode;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
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
	public String getMemberCondition() {
		return memberCondition;
	}
	public void setMemberCondition(String memberCondition) {
		this.memberCondition = memberCondition;
	}
	
	@Override
	public String toString() {
		return "MemberSimple [memberEmail=" + memberEmail + ", memberClassificationCode=" + memberClassificationCode
				+ ", comCode=" + comCode + ", memberName=" + memberName + ", memberPassword=" + memberPassword
				+ ", memberCondition=" + memberCondition + "]";
	}
}
