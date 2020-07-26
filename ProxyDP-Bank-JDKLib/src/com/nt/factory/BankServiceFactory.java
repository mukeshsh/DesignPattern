package com.nt.factory;

import java.lang.reflect.Proxy;

import com.nt.commond.BankService;
import com.nt.commond.BankServiceImpl;
import com.nt.proxy.ProxyHelper;

public class BankServiceFactory {

	public static BankService getInstance(boolean  isDemonitazionEnabled) {
		BankService  service=null;
		if(isDemonitazionEnabled)
			service=(BankService) Proxy.newProxyInstance(BankService.class.getClassLoader(),new Class[] {BankService.class},new ProxyHelper());
		else
			service=new BankServiceImpl();  //real object
		return service;
	}

}
