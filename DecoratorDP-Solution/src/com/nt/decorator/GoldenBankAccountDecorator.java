package com.nt.decorator;

import com.nt.component.BankAccount;

public class GoldenBankAccountDecorator extends BankAccountDecorator {
       public GoldenBankAccountDecorator(BankAccount account) {
		super(account);
	}
       @Override
    public void openAccount() {
    	super.openAccount();
    	addMinimumBalance();
    	addprevilagedBanking();
    }
       private void addMinimumBalance() {
    	   System.out.println("Rs:2000 is minimum balances...");
       }
       private void addprevilagedBanking() {
    	   System.out.println("Adding Previlaged Banking(Priority Customer) No Quee for Transaction ");
       }
}
