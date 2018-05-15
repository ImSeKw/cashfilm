package com.boa.cashfilm.smtcom.dto;

public class StatementCompanyStatementClassification {
	private int statementClassificationCode;
	private String statementClassificationName;
	
	public int getStatementClassificationCode() {
		return statementClassificationCode;
	}
	public void setStatementClassificationCode(int statementClassificationCode) {
		this.statementClassificationCode = statementClassificationCode;
	}
	public String getStatementClassificationName() {
		return statementClassificationName;
	}
	public void setStatementClassificationName(String statementClassificationName) {
		this.statementClassificationName = statementClassificationName;
	}
	
	@Override
	public String toString() {
		return "StatementCompanyStatementClassification [statementClassificationCode=" + statementClassificationCode
				+ ", statementClassificationName=" + statementClassificationName + "]";
	}
}