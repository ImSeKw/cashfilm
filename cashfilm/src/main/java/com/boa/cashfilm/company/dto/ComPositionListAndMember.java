package com.boa.cashfilm.company.dto;

public class ComPositionListAndMember {
	private int comPositionCode;
	private int comCode;
	private String comPositionName;
	private String memberEmail;
	private String memberName;
	public int getComPositionCode() {
		return comPositionCode;
	}
	public void setComPositionCode(int comPositionCode) {
		this.comPositionCode = comPositionCode;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getComPositionName() {
		return comPositionName;
	}
	public void setComPositionName(String comPositionName) {
		this.comPositionName = comPositionName;
	}
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
	@Override
	public String toString() {
		return "ComPositionAndMember [comPositionCode=" + comPositionCode + ", comCode=" + comCode
				+ ", comPositionName=" + comPositionName + ", memberEmail=" + memberEmail + ", memberName=" + memberName
				+ "]";
	}
	
	
}
