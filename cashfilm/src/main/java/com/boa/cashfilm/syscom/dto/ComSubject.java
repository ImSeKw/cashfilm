package com.boa.cashfilm.syscom.dto;

public class ComSubject {
	private int comSubjectNumeral;
	private int comSystemNumeral;
	private String comSubjectName;
	
	public int getComSubjectNumeral() {
		return comSubjectNumeral;
	}
	public void setComSubjectNumeral(int comSubjectNumeral) {
		this.comSubjectNumeral = comSubjectNumeral;
	}
	public int getComSystemNumeral() {
		return comSystemNumeral;
	}
	public void setComSystemNumeral(int comSystemNumeral) {
		this.comSystemNumeral = comSystemNumeral;
	}
	public String getComSubjectName() {
		return comSubjectName;
	}
	public void setComSubjectName(String comSubjectName) {
		this.comSubjectName = comSubjectName;
	}
	@Override
	public String toString() {
		return "ComSubject [comSubjectNumeral=" + comSubjectNumeral + ", comSystemNumeral=" + comSystemNumeral
				+ ", comSubjectName=" + comSubjectName + "]";
	}
	
	
	
	

}
