package com.nt.adapter;

import com.nt.dto.CardInfoDTO;
import com.nt.external.PayPaICompImpl;
import com.nt.external.PayPalComp;

public class BankNameToBankCodeAdapter {
    public static String convertBankNameToBankCodeAnddoPayment(CardInfoDTO dto) {
    	int bankCode=0;
    	PayPalComp extComp=null;
    	String result=null;
    	//convert bankName to bankcode
    	if(dto.getBankName().equalsIgnoreCase("SBI"))
    		bankCode=1001;
    	else if(dto.getBankName().equalsIgnoreCase("HDFC"))
    		bankCode=1002;
    	else if(dto.getBankName().equalsIgnoreCase("ICICI"))
    		bankCode=1003;
    	else if(dto.getBankName().equalsIgnoreCase("Axis"))
    		bankCode=1004;
    	else
    		throw new IllegalArgumentException("Invalid Bank Name");
    	dto.setBankCode(bankCode);
    	//get external component reference
    extComp=PayPaICompImpl.INSTANCE;
    	//invoked the method;
    	result=extComp.doPayment(dto);
    	return result;
    }
}
