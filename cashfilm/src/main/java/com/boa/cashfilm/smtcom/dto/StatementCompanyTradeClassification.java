package com.boa.cashfilm.smtcom.dto;

public class StatementCompanyTradeClassification {
	private int tradeClassificationCode;
	private String tradeClassificationName;
	
	public int getTradeClassificationCode() {
		return tradeClassificationCode;
	}
	public void setTradeClassificationCode(int tradeClassificationCode) {
		this.tradeClassificationCode = tradeClassificationCode;
	}
	public String getTradeClassificationName() {
		return tradeClassificationName;
	}
	public void setTradeClassificationName(String tradeClassificationName) {
		this.tradeClassificationName = tradeClassificationName;
	}
	
	@Override
	public String toString() {
		return "StatementCompanyTradeClassification [tradeClassificationCode=" + tradeClassificationCode
				+ ", tradeClassificationName=" + tradeClassificationName + "]";
	}
}