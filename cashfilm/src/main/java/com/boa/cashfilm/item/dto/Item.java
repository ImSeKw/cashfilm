package com.boa.cashfilm.item.dto;

public class Item {
	
	private int myItemCode;
	private String myItemName;
	private int myItemAmount;
	private String myItemExpiration;
	
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
	public int getMyItemAmount() {
		return myItemAmount;
	}
	public void setMyItemAmount(int myItemAmount) {
		this.myItemAmount = myItemAmount;
	}
	public String getMyItemExpiration() {
		return myItemExpiration;
	}
	public void setMyItemExpiration(String myItemExpiration) {
		this.myItemExpiration = myItemExpiration;
	}
	
	@Override
	public String toString() {
		return "Item [myItemCode=" + myItemCode + ", myItemName=" + myItemName + ", myItemAmount=" + myItemAmount
				+ ", myItemExpiration=" + myItemExpiration + "]";
	}
}
