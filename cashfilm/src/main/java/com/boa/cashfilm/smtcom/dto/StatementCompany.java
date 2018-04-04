package com.boa.cashfilm.smtcom.dto;

public class StatementCompany {
	private int financeCode;
	private int comCode;
	private int comSystemNumeral;
	private String memberEmail;
	private long financeAmount;
	private String closingStatementCode;
	
	public int getFinanceCode() {
		return financeCode;
	}
	public void setFinanceCode(int financeCode) {
		this.financeCode = financeCode;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public int getComSystemNumeral() {
		return comSystemNumeral;
	}
	public void setComSystemNumeral(int comSystemNumeral) {
		this.comSystemNumeral = comSystemNumeral;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public long getFinanceAmount() {
		return financeAmount;
	}
	public void setFinanceAmount(long financeAmount) {
		this.financeAmount = financeAmount;
	}
	public String getClosingStatementCode() {
		return closingStatementCode;
	}
	public void setClosingStatementCode(String closingStatementCode) {
		this.closingStatementCode = closingStatementCode;
	}
	
	@Override
	public String toString() {
		return "StatementCompany [financeCode=" + financeCode + ", comCode=" + comCode + ", comSystemNumeral="
				+ comSystemNumeral + ", memberEmail=" + memberEmail + ", financeAmount=" + financeAmount
				+ ", closingStatementCode=" + closingStatementCode + "]";
	}
}
