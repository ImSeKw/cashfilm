package com.boa.cashfilm.member.dto;

public class MemberDel {
	private String memberEmail;
	private String memberDelRequestDay;
	private String memberDelDay;
	private String memberDelReason;
	private String memberDelApprovalEmail;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberDelRequestDay() {
		return memberDelRequestDay;
	}
	public void setMemberDelRequestDay(String memberDelRequestDay) {
		this.memberDelRequestDay = memberDelRequestDay;
	}
	public String getMemberDelDay() {
		return memberDelDay;
	}
	public void setMemberDelDay(String memberDelDay) {
		this.memberDelDay = memberDelDay;
	}
	public String getMemberDelReason() {
		return memberDelReason;
	}
	public void setMemberDelReason(String memberDelReason) {
		this.memberDelReason = memberDelReason;
	}
	public String getMemberDelApprovalEmail() {
		return memberDelApprovalEmail;
	}
	public void setMemberDelApprovalEmail(String memberDelApprovalEmail) {
		this.memberDelApprovalEmail = memberDelApprovalEmail;
	}
	
	@Override
	public String toString() {
		return "MemberDel [memberEmail=" + memberEmail + ", memberDelRequestDay=" + memberDelRequestDay
				+ ", memberDelDay=" + memberDelDay + ", memberDelReason=" + memberDelReason
				+ ", memberDelApprovalEmail=" + memberDelApprovalEmail + "]";
	}
}