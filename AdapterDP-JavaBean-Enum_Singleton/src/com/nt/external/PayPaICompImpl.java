package com.nt.external;

import java.util.Random;

import com.nt.dto.CardInfoDTO;

public enum PayPaICompImpl implements PayPalComp {
	 INSTANCE;
	
	@Override
	public String doPayment(CardInfoDTO dto) {
		Random rad=null;
		rad= new Random();
		return "Txid :: "+rad.nextInt(1000000)+"   Transaction is successfully compelled for the amount No::  "+dto.getAmt();
	}

}
