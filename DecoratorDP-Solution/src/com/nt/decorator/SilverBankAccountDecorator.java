package com.nt.decorator;

import com.nt.component.BankAccount;

public class SilverBankAccountDecorator extends BankAccountDecorator {
       public SilverBankAccountDecorator(BankAccount account) {
		super(account);
	}
       @Override
    public void openAccount() {
    	super.openAccount();
    	addMinBalance();
    	addWorkFromHomeServices();
    }
       private void addMinBalance(){
    	   System.out.println("Rs::10000 Min Balance....");
       }
       private void addWorkFromHomeServices() {
    	   System.out.println("adding Banking from Home service (Employee will come to home)");
       }
}
