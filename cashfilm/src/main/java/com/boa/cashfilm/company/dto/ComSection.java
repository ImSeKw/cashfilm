package com.boa.cashfilm.company.dto;

public class ComSection {
	private int comSectionCode;
	private int comCode;
	private String comSectionName;
	public int getComSectionCode() {
		return comSectionCode;
	}
	public void setComSectionCode(int comSectionCode) {
		this.comSectionCode = comSectionCode;
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
		return "ComSection [comSectionCode=" + comSectionCode + ", comCode=" + comCode + ", comSectionName="
				+ comSectionName + "]";
	}
	
}
