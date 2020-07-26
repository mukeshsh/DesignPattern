package com.nt.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.nt.commond.BankService;
import com.nt.commond.BankServiceImpl;

public class ProxyHelper implements InvocationHandler {
	private BankService orginal=null;
	public ProxyHelper() {
		orginal=new BankServiceImpl();
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object retVal=null;
		if(method.getName().equalsIgnoreCase("withdraw")) {
			if(((Float)args[1])<=4000)
				retVal=method.invoke(orginal, args);
			else {
				args[1]=4000;
				retVal=method.invoke(orginal, args);
				retVal=retVal+"You Can not withdraw more than 4000";
			}
		}
		else if(method.getName().equalsIgnoreCase("deposite")) {
			if(((Float)args[1])<=50000)
				retVal=method.invoke(orginal, args);
			else {
				args[1]=50000;
				retVal=method.invoke(orginal, args);
				retVal=retVal+" u can not deposite more than Rs.50000";
			}//else
		}
		else
		{
			retVal=method.invoke(orginal, args);
		}
		return retVal;
	}
}
