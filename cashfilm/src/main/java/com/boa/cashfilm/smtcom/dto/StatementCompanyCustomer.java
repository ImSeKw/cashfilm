package com.boa.cashfilm.smtcom.dto;

public class StatementCompanyCustomer {
	private int customerCode;
	private int comCode;
	private String customerNumber;
	private String customerCeo;
	private String customerName;
	private String customerAddress;
	private String customerPhone;
	private String customerCreditNumber;
	private String customerContactNumber;
	private String customerCategory;
	private String customerRemarks;
	
	public int getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}
	public int getComCode() {
		return comCode;
	}
	public void setComCode(int comCode) {
		this.comCode = comCode;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerCeo() {
		return customerCeo;
	}
	public void setCustomerCeo(String customerCeo) {
		this.customerCeo = customerCeo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerCreditNumber() {
		return customerCreditNumber;
	}
	public void setCustomerCreditNumber(String customerCreditNumber) {
		this.customerCreditNumber = customerCreditNumber;
	}
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	public String getCustomerCategory() {
		return customerCategory;
	}
	public void setCustomerCategory(String customerCategory) {
		this.customerCategory = customerCategory;
	}
	public String getCustomerRemarks() {
		return customerRemarks;
	}
	public void setCustomerRemarks(String customerRemarks) {
		this.customerRemarks = customerRemarks;
	}
	
	@Override
	public String toString() {
		return "StatementCompanyCustomer [customerCode=" + customerCode + ", comCode=" + comCode + ", customerNumber="
				+ customerNumber + ", customerCeo=" + customerCeo + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone
				+ ", customerCreditNumber=" + customerCreditNumber + ", customerContactNumber=" + customerContactNumber
				+ ", customerCategory=" + customerCategory + ", customerRemarks=" + customerRemarks + "]";
	}
}
