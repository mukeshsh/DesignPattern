package com.nt.adapter;

import com.nt.external.PayPaICompImpl;
import com.nt.external.PayPalComp;

public class BankNameToBankCodeAdapter {
    public static String convertBankNameToBankCodeAnddoPayment(String bankName,int cardNo,float amt) {
    	int bankCode=0;
    	PayPalComp extComp=null;
    	String result=null;
    	//convert bankName to bankcode
    	if(bankName.equalsIgnoreCase("SBI"))
    		bankCode=1001;
    	else if(bankName.equalsIgnoreCase("HDFC"))
    		bankCode=1002;
    	else if(bankName.equalsIgnoreCase("ICICI"))
    		bankCode=1003;
    	else if(bankName.equalsIgnoreCase("Axis"))
    		bankCode=1004;
    	else
    		throw new IllegalArgumentException("Invalid Bank Name");
    	//get external component reference
    	extComp=PayPaICompImpl.getInstance();
    	//invoked the method;
    	result=extComp.doPayment(cardNo, bankCode, amt);
    	return result;
    }
}
