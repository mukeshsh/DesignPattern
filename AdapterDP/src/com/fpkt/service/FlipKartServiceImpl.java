package com.fpkt.service;

import com.nt.adapter.BankNameToBankCodeAdapter;

public class FlipKartServiceImpl implements FlipKartService {
    @Override
	public String shoppingAndPayment(String[] items, float[] prices, int cardNo, String bankName) {
		float billAmt=0.0f;
		String result=null;
		//calculate Bill Amount
		for(float price:prices) {
			billAmt=billAmt+price;
		}
		//do payment
		result=BankNameToBankCodeAdapter.convertBankNameToBankCodeAnddoPayment(bankName, cardNo, billAmt);
		return result;
	}

}
