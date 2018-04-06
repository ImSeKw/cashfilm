package com.boa.cashfilm.company.dto;

public class ComSection {
	private int comSection;
	private int comCode;
	private String comSectionName;
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
	@Override
	public String toString() {
		return "ComSection [comSection=" + comSection + ", comCode=" + comCode + ", comSectionName=" + comSectionName
				+ "]";
	}
	
}
