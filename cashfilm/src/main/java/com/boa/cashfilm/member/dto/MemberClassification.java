package com.boa.cashfilm.member.dto;

public class MemberClassification {
	private int memberClassificationCode;
	private String memberClassificationName;
	
	public int getMemberClassificationCode() {
		return memberClassificationCode;
	}
	public void setMemberClassificationCode(int memberClassificationCode) {
		this.memberClassificationCode = memberClassificationCode;
	}
	public String getMemberClassificationName() {
		return memberClassificationName;
	}
	public void setMemberClassificationName(String memberClassificationName) {
		this.memberClassificationName = memberClassificationName;
	}
	
	@Override
	public String toString() {
		return "MemberClassification [memberClassificationCode=" + memberClassificationCode
				+ ", memberClassificationName=" + memberClassificationName + "]";
	}
}