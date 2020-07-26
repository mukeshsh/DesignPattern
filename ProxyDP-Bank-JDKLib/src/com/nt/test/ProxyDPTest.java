package com.nt.test;

import java.util.Arrays;

import com.nt.commond.BankService;
import com.nt.factory.BankServiceFactory;

public class ProxyDPTest {

	public static void main(String[] args) {
		BankService service=null;
		//get object
		service=BankServiceFactory.getInstance(true);
		System.out.println("Service Object class name::"+service.getClass()+" ----> "+service.getClass().getSuperclass()+"---------->"+Arrays.deepToString(service.getClass().getInterfaces()));
		System.out.println("---------------------------------------------------");
		//invoked method
		System.out.println("Result is ::"+service.withdraw(1001, 20000));
		System.out.println("----------------------------------------------------");
		System.out.println("Deposited Money is::"+service.deposite(1002, 3000));
	}

}
