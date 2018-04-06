package com.boa.cashfilm.company.dto;

public class ComPosition {
	private int comPositionCode;
	private int comCode;
	private String comPositionName;
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
	@Override
	public String toString() {
		return "ComPosition [comPositionCode=" + comPositionCode + ", comCode=" + comCode + ", comPositionName="
				+ comPositionName + "]";
	}
	
}
