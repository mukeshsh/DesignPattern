package com.nt.external;

import java.util.Random;

public class PayPaICompImpl implements PayPalComp {
	private static PayPalComp INSTANCE;
	private PayPaICompImpl() {
		System.out.println("PayPaICompmpl::0-param Constructor");
	}
	//to stop cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	//to stop deserialization
	public Object readResolve() {
		return INSTANCE;
	}
	public static PayPalComp getInstance() {
		if(INSTANCE==null) {
			synchronized (PayPalComp.class) {
				if(INSTANCE==null) 
					INSTANCE=new PayPaICompImpl();
				
			}
		}
		return INSTANCE;
	}
	@Override
	public String doPayment(int cardNo, int bankCode, float amt) {
		Random rad=null;
		rad= new Random();
		return "Txid :: "+rad.nextInt(1000000)+"   Transaction is successfully compelled for the amount No::  "+amt;
	}

}
