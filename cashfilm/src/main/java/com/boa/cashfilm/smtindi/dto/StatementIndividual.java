package com.boa.cashfilm.smtindi.dto;

public class StatementIndividual {
	private int financeCode;
	private int individualSystemNumeral;
	private String memberEmail;
	private long financeAmount;
	private int closingStatementCode;
	
	public int getFinanceCode() {
		return financeCode;
	}
	public void setFinanceCode(int financeCode) {
		this.financeCode = financeCode;
	}
	public int getIndividualSystemNumeral() {
		return individualSystemNumeral;
	}
	public void setIndividualSystemNumeral(int individualSystemNumeral) {
		this.individualSystemNumeral = individualSystemNumeral;
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
	public int getClosingStatementCode() {
		return closingStatementCode;
	}
	public void setClosingStatementCode(int closingStatementCode) {
		this.closingStatementCode = closingStatementCode;
	}
	
	@Override
	public String toString() {
		return "StatementIndividual [financeCode=" + financeCode + ", individualSystemNumeral="
				+ individualSystemNumeral + ", memberEmail=" + memberEmail + ", financeAmount=" + financeAmount
				+ ", closingStatementCode=" + closingStatementCode + "]";
	}
}