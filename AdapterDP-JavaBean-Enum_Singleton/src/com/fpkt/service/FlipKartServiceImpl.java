package com.fpkt.service;

import com.nt.adapter.BankNameToBankCodeAdapter;
import com.nt.dto.CardInfoDTO;
import com.nt.dto.PaymentInfoDTO;

public class FlipKartServiceImpl implements FlipKartService {
    @Override
	public String shoppingAndPayment(PaymentInfoDTO dto) {
		float billAmt=0.0f;
		String result=null;
		CardInfoDTO cdto=null;
		//calculate Bill Amount
		for(float price:dto.getPrices()) {
			billAmt=billAmt+price;
		}
		//prepare another dto class object
		cdto=new CardInfoDTO();
		cdto.setCardNo(dto.getCardNo());
		cdto.setBankName(dto.getBankName());
		cdto.setAmt(billAmt);
		//do payment
		result=BankNameToBankCodeAdapter.convertBankNameToBankCodeAnddoPayment(cdto);
		return result;
	}

}
