package com.boa.cashfilm.syscom.dto;

public class ComSystemAndSubject {
	private int comSystemNumeral;
	private String comSystemName;
	private int comSubjectNumeral;
	private String comSubjectName;
	
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
	public int getComSubjectNumeral() {
		return comSubjectNumeral;
	}
	public void setComSubjectNumeral(int comSubjectNumeral) {
		this.comSubjectNumeral = comSubjectNumeral;
	}
	public String getComSubjectName() {
		return comSubjectName;
	}
	public void setComSubjectName(String comSubjectName) {
		this.comSubjectName = comSubjectName;
	}
	@Override
	public String toString() {
		return "ComSystemAndSubject [comSystemNumeral=" + comSystemNumeral + ", comSystemName=" + comSystemName
				+ ", comSubjectNumeral=" + comSubjectNumeral + ", comSubjectName=" + comSubjectName + "]";
	} 
	
	

}
