package com.boa.cashfilm.smtindi.dto;

public class StatementIndividualList {
	private String individualSystemName;
	private int financeCode;
	private String individualSystemNumeral;
	private String memberEmail;
	private long financeAmount;
	private String closingStatementCode;
	public String getIndividualSystemName() {
		return individualSystemName;
	}
	public void setIndividualSystemName(String individualSystemName) {
		this.individualSystemName = individualSystemName;
	}
	public int getFinanceCode() {
		return financeCode;
	}
	public void setFinanceCode(int financeCode) {
		this.financeCode = financeCode;
	}
	public String getIndividualSystemNumeral() {
		return individualSystemNumeral;
	}
	public void setIndividualSystemNumeral(String individualSystemNumeral) {
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
	public String getClosingStatementCode() {
		return closingStatementCode;
	}
	public void setClosingStatementCode(String closingStatementCode) {
		this.closingStatementCode = closingStatementCode;
	}
	@Override
	public String toString() {
		return "StatementIndividualList [individualSystemName=" + individualSystemName + ", financeCode=" + financeCode
				+ ", individualSystemNumeral=" + individualSystemNumeral + ", memberEmail=" + memberEmail
				+ ", financeAmount=" + financeAmount + ", closingStatementCode=" + closingStatementCode + "]";
	}
	
	

}
