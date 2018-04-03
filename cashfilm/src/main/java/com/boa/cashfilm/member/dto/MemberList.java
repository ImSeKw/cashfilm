package com.boa.cashfilm.member.dto;

public class MemberList {
	private String memberEmail;
	private String memberClassificationName;
	private String memberName;
	private String memberCondition;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getMemberClassificationName() {
		return memberClassificationName;
	}
	public void setMemberClassificationName(String memberClassificationName) {
		this.memberClassificationName = memberClassificationName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberCondition() {
		return memberCondition;
	}
	public void setMemberCondition(String memberCondition) {
		this.memberCondition = memberCondition;
	}
	
	@Override
	public String toString() {
		return "MemberList [memberEmail=" + memberEmail + ", memberClassificationName=" + memberClassificationName
				+ ", memberName=" + memberName + ", memberCondition=" + memberCondition + "]";
	}
}
