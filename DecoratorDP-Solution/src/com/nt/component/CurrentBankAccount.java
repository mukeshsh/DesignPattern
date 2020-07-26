package com.nt.component;

public class CurrentBankAccount implements BankAccount{
	
	public CurrentBankAccount() {
    System.out.println("CurrentBankAccount::0-Param Constructor");
	}
	@Override
	public void openAccount() {
		System.out.println("CurrentBankAccount:: Open Current Account.........");

	}

}
