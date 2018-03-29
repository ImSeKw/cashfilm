package com.boa.cashfilm.company.dto;

public class InsertCompanyBaseInfo {
	private String comName;
	private String comRegistrationNumber;
	private String comWebPage;
	private String comCeoName;
	private String comInfo;
	private String comIntroduction;
	private String comAddress;
	private String comPhone;
	private String memberEmail;
	private String comIndustry;
	private String comCondition;
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComRegistrationNumber() {
		return comRegistrationNumber;
	}
	public void setComRegistrationNumber(String comRegistrationNumber) {
		this.comRegistrationNumber = comRegistrationNumber;
	}
	public String getComWebPage() {
		return comWebPage;
	}
	public void setComWebPage(String comWebPage) {
		this.comWebPage = comWebPage;
	}
	public String getComCeoName() {
		return comCeoName;
	}
	public void setComCeoName(String comCeoName) {
		this.comCeoName = comCeoName;
	}
	public String getComInfo() {
		return comInfo;
	}
	public void setComInfo(String comInfo) {
		this.comInfo = comInfo;
	}
	public String getComIntroduction() {
		return comIntroduction;
	}
	public void setComIntroduction(String comIntroduction) {
		this.comIntroduction = comIntroduction;
	}
	public String getComAddress() {
		return comAddress;
	}
	public void setComAddress(String comAddress) {
		this.comAddress = comAddress;
	}
	public String getComPhone() {
		return comPhone;
	}
	public void setComPhone(String comPhone) {
		this.comPhone = comPhone;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public String getComIndustry() {
		return comIndustry;
	}
	public void setComIndustry(String comIndustry) {
		this.comIndustry = comIndustry;
	}
	public String getComCondition() {
		return comCondition;
	}
	public void setComCondition(String comCondition) {
		this.comCondition = comCondition;
	}
	@Override
	public String toString() {
		return "InsertCompanyBaseInfo [comName=" + comName + ", comRegistrationNumber=" + comRegistrationNumber
				+ ", comWebPage=" + comWebPage + ", comCeoName=" + comCeoName + ", comInfo=" + comInfo
				+ ", comIntroduction=" + comIntroduction + ", comAddress=" + comAddress + ", comPhone=" + comPhone
				+ ", memberEmail=" + memberEmail + ", comIndustry=" + comIndustry + ", comCondition=" + comCondition
				+ "]";
	}
	
	
}
