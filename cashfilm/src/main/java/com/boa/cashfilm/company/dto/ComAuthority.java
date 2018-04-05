package com.boa.cashfilm.company.dto;

public class ComAuthority {
	private int comCode;
	private String memberEmail;
	private int comSectionCode;
	private int comPositionCode;
	private int comSystemChange;
	private int comAuthorityApproval;
	private String comAuthorityApprovalDay;
	private String comAuthorityApprovalEmail;
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getComSectionCode() {
		return comSectionCode;
	}
	public void setComSectionCode(int comSectionCode) {
		this.comSectionCode = comSectionCode;
	}
	public int getComPositionCode() {
		return comPositionCode;
	}
	public void setComPositionCode(int comPositionCode) {
		this.comPositionCode = comPositionCode;
	}
	public int getComSystemChange() {
		return comSystemChange;
	}
	public void setComSystemChange(int comSystemChange) {
		this.comSystemChange = comSystemChange;
	}
	public int getComAuthorityApproval() {
		return comAuthorityApproval;
	}
	public void setComAuthorityApproval(int comAuthorityApproval) {
		this.comAuthorityApproval = comAuthorityApproval;
	}
	public String getComAuthorityApprovalDay() {
		return comAuthorityApprovalDay;
	}
	public void setComAuthorityApprovalDay(String comAuthorityApprovalDay) {
		this.comAuthorityApprovalDay = comAuthorityApprovalDay;
	}
	public String getComAuthorityApprovalEmail() {
		return comAuthorityApprovalEmail;
	}
	public void setComAuthorityApprovalEmail(String comAuthorityApprovalEmail) {
		this.comAuthorityApprovalEmail = comAuthorityApprovalEmail;
	}
	@Override
	public String toString() {
		return "ComAuthority [comCode=" + comCode + ", memberEmail=" + memberEmail + ", comSectionCode="
				+ comSectionCode + ", comPositionCode=" + comPositionCode + ", comSystemChange=" + comSystemChange
				+ ", comAuthorityApproval=" + comAuthorityApproval + ", comAuthorityApprovalDay="
				+ comAuthorityApprovalDay + ", comAuthorityApprovalEmail=" + comAuthorityApprovalEmail + "]";
	}
	
}
