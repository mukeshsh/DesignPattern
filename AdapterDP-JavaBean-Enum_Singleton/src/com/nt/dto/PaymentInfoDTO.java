package com.nt.dto;

import java.io.Serializable;
import java.util.Arrays;

public class PaymentInfoDTO implements Serializable {
    private static final long serialVersionUID=1L;
    private String[] items;
    private float[] prices;
    private int cardNo;
    private String bankName;
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public float[] getPrices() {
		return prices;
	}
	public void setPrices(float[] prices) {
		this.prices = prices;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PaymentInfoDTO [items=" + Arrays.toString(items) + ", prices=" + Arrays.toString(prices) + ", cardNo="
				+ cardNo + ", bankName=" + bankName + "]";
	}
    
}
