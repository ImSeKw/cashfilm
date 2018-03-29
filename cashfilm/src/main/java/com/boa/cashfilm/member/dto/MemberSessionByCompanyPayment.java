package com.boa.cashfilm.member.dto;

public class MemberSessionByCompanyPayment {
	private String memberEmail;
	private int comCode;
	private int voucherPaymentCode;
	private String voucherPaymentDay;
	private int myItemCode;
	private String myItemName;
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public int getVoucherPaymentCode() {
		return voucherPaymentCode;
	}
	public void setVoucherPaymentCode(int voucherPaymentCode) {
		this.voucherPaymentCode = voucherPaymentCode;
	}
	public String getVoucherPaymentDay() {
		return voucherPaymentDay;
	}
	public void setVoucherPaymentDay(String voucherPaymentDay) {
		this.voucherPaymentDay = voucherPaymentDay;
	}
	public int getMyItemCode() {
		return myItemCode;
	}
	public void setMyItemCode(int myItemCode) {
		this.myItemCode = myItemCode;
	}
	public String getMyItemName() {
		return myItemName;
	}
	public void setMyItemName(String myItemName) {
		this.myItemName = myItemName;
	}
}