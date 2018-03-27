package com.boa.cashfilm.sysindi.dto;

import java.util.List;

public class IndividuanlSystemAndSubject {
	private int individualSystemNumeral;
	private String individualSystemName;
	private List<IndividualSubject> list;
	public int getIndividualSystemNumeral() {
		return individualSystemNumeral;
	}
	public void setIndividualSystemNumeral(int individualSystemNumeral) {
		this.individualSystemNumeral = individualSystemNumeral;
	}
	public String getIndividualSystemName() {
		return individualSystemName;
	}
	public void setIndividualSystemName(String individualSystemName) {
		this.individualSystemName = individualSystemName;
	}
	public List<IndividualSubject> getList() {
		return list;
	}
	public void setList(List<IndividualSubject> list) {
		this.list = list;
	}
	
	
}
