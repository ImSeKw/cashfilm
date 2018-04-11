package com.boa.cashfilm.smtcom.dto;

public class StatementCompanyFinanceCode {
	private int comCode;
	private int financeCode;
	private String closingStatementCode;
	
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public int getFinanceCode() {
		return financeCode;
	}
	public void setFinanceCode(int financeCode) {
		this.financeCode = financeCode;
	}
	public String getClosingStatementCode() {
		return closingStatementCode;
	}
	public void setClosingStatementCode(String closingStatementCode) {
		this.closingStatementCode = closingStatementCode;
	}
	
	@Override
	public String toString() {
		return "StatementCompanyFinanceCode [comCode=" + comCode + ", financeCode=" + financeCode
				+ ", closingStatementCode=" + closingStatementCode + "]";
	}
}