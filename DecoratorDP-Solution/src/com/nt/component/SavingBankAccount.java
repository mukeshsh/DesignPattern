package com.nt.component;

public class SavingBankAccount implements BankAccount{
	
	public SavingBankAccount() {
    System.out.println("SavingBankAccount::0-Param Constructor");
	}
	@Override
	public void openAccount() {
		System.out.println("SavingBankAccount:: Open Savings Account.........");

	}

}
