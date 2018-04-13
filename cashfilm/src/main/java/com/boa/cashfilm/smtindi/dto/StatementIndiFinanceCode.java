package com.boa.cashfilm.smtindi.dto;

public class StatementIndiFinanceCode {
	private String memberEmail;
	private int financeCode;
	private String closingStatementCode;
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
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
		return "StatementIndiFinanceCode [memberEmail=" + memberEmail + ", financeCode=" + financeCode
				+ ", closingStatementCode=" + closingStatementCode + "]";
	}
	
	
	
	
}
