package com.boa.cashfilm.member.dto;

public class MemberSession {
	private String memberEmail;
	private int memberClassificationCode;
	private String memberClassificationName;
	private int comCode;
	private String comName;
	private String memberName;
	private String memberCondition;
	private int comSystemChange;
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
	public int getMemberClassificationCode() {
		return memberClassificationCode;
	}
	public void setMemberClassificationCode(int memberClassificationCode) {
		this.memberClassificationCode = memberClassificationCode;
	}
	public String getMemberClassificationName() {
		return memberClassificationName;
	}
	public void setMemberClassificationName(String memberClassificationName) {
		this.memberClassificationName = memberClassificationName;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getComName() {
		return comName;
	}
	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberCondition() {
		return memberCondition;
	}
	public void setMemberCondition(String memberCondition) {
		this.memberCondition = memberCondition;
	}
	public int getComSystemChange() {
		return comSystemChange;
	}
	public void setComSystemChange(int comSystemChange) {
		this.comSystemChange = comSystemChange;
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
	
	@Override
	public String toString() {
		return "MemberSession [memberEmail=" + memberEmail + ", memberClassificationCode=" + memberClassificationCode
				+ ", memberClassificationName=" + memberClassificationName + ", comCode=" + comCode + ", comName="
				+ comName + ", memberName=" + memberName + ", memberCondition=" + memberCondition + ", comSystemChange="
				+ comSystemChange + ", voucherPaymentCode=" + voucherPaymentCode + ", voucherPaymentDay="
				+ voucherPaymentDay + ", myItemCode=" + myItemCode + ", myItemName=" + myItemName + "]";
	}
}
