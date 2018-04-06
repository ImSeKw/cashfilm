package com.boa.cashfilm.company.dto;

public class ComSectionListAndMember {
	private int comSection;
	private int comCode;
	private String comSectionName;
	private String memberEmail;
	private String memberName;
	public int getComSection() {
		return comSection;
	}
	public void setComSection(int comSection) {
		this.comSection = comSection;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getComSectionName() {
		return comSectionName;
	}
	public void setComSectionName(String comSectionName) {
		this.comSectionName = comSectionName;
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
		return "ComSectionListAndMember [comSection=" + comSection + ", comCode=" + comCode + ", comSectionName="
				+ comSectionName + ", memberEmail=" + memberEmail + ", memberName=" + memberName + "]";
	}
	
	
}
