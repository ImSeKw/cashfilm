package com.boa.cashfilm.company.dto;

public class ComListByIndividual {
	private int comCode;
	private String comName;
	private String comCeoName;
	private String comRegistrationNumber;
	private String comInfo;
	private String comAddress;
	private String comPhone;
	private String comIndustry;
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComCeoName() {
		return comCeoName;
	}
	public void setComCeoName(String comCeoName) {
		this.comCeoName = comCeoName;
	}
	public String getComRegistrationNumber() {
		return comRegistrationNumber;
	}
	public void setComRegistrationNumber(String comRegistrationNumber) {
		this.comRegistrationNumber = comRegistrationNumber;
	}
	public String getComInfo() {
		return comInfo;
	}
	public void setComInfo(String comInfo) {
		this.comInfo = comInfo;
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
	public String getComIndustry() {
		return comIndustry;
	}
	public void setComIndustry(String comIndustry) {
		this.comIndustry = comIndustry;
	}
	@Override
	public String toString() {
		return "ComListByIndividual [comCode=" + comCode + ", comName=" + comName + ", comCeoName=" + comCeoName
				+ ", comRegistrationNumber=" + comRegistrationNumber + ", comInfo=" + comInfo + ", comAddress="
				+ comAddress + ", comPhone=" + comPhone + ", comIndustry=" + comIndustry + "]";
	}
	
}