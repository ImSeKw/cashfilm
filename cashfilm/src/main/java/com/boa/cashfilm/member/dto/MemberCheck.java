package com.boa.cashfilm.member.dto;

public class MemberCheck {
	private String memberEmail;
	private String memberPassword;
	private String memberDelReason;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberDelReason() {
		return memberDelReason;
	}
	public void setMemberDelReason(String memberDelReason) {
		this.memberDelReason = memberDelReason;
	}
	
	@Override
	public String toString() {
		return "MemberCheck [memberEmail=" + memberEmail + ", memberPassword=" + memberPassword + ", memberDelReason="
				+ memberDelReason + "]";
	}
}
