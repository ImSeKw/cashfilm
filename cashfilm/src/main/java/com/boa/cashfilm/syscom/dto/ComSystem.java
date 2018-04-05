package com.boa.cashfilm.syscom.dto;

public class ComSystem {
	private int comSystemNumeral;
	private String comSystemName;
	
	public int getComSystemNumeral() {
		return comSystemNumeral;
	}
	public void setComSystemNumeral(int comSystemNumeral) {
		this.comSystemNumeral = comSystemNumeral;
	}
	public String getComSystemName() {
		return comSystemName;
	}
	public void setComSystemName(String comSystemName) {
		this.comSystemName = comSystemName;
	}
	@Override
	public String toString() {
		return "ComSystem [comSystemNumeral=" + comSystemNumeral + ", comSystemName=" + comSystemName + "]";
	}
	
	

}
