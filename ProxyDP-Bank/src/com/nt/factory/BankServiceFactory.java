package com.nt.factory;

import com.nt.commond.BankService;
import com.nt.commond.BankServiceImpl;
import com.nt.proxy.BankServiceProxy;

public class BankServiceFactory {
    public static BankService getInstance(boolean isDemonitazionEnable) {
    	BankService service=null;
    
    	if(isDemonitazionEnable)
    		service=new BankServiceProxy();
    	else
    		service=new BankServiceImpl();
    	return service;
    }
}
