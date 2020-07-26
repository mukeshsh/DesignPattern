package com.nt.dto;

import java.io.Serializable;

public class CardInfoDTO implements Serializable {
    private int cardNo;
    private String bankName;
    private int bankCode;
    private float amt;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public float getAmt() {
		return amt;
	}
	public void setAmt(float amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "CardInfoDTO [cardNo=" + cardNo + ", bankName=" + bankName + ", bankCode=" + bankCode + ", amt=" + amt
				+ "]";
	}
    
}
