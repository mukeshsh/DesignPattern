package com.nt.decorator;

import com.nt.component.BankAccount;

public class CreditCardDecorator extends BankAccountDecorator {
       public CreditCardDecorator(BankAccount account) {
		super(account);
	}
       @Override
    public void openAccount() {
    	super.openAccount();
    	addCreditCardServices();
    }
       private void addCreditCardServices() {
    	   System.out.println("Adding Credit Card Services.............");
       }
}
