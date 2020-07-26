package com.nt.decorator;

import com.nt.component.BankAccount;

public class NRIBankAccountDecorator extends BankAccountDecorator {
       public NRIBankAccountDecorator(BankAccount account) {
		super(account);
	}
       @Override
    public void openAccount() {
    	super.openAccount();
    	addForeignCountryTransactionService();
    }
       private void addForeignCountryTransactionService() {
    	   System.out.println("Adding Foreign Country Transaction Services.............");
       }
}
