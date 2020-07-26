package com.nt.decorator;

import com.nt.component.BankAccount;

public class PlatinumBankAccountDecorator extends BankAccountDecorator {
       public PlatinumBankAccountDecorator(BankAccount account) {
		super(account);
	}
       @Override
    public void openAccount() {
    	super.openAccount();
    	addMinBalance();
    	addprevilagedBanking();
    	addWorkFromHomeServices();
    }
       private void addMinBalance(){
    	   System.out.println("Rs::30000 Min Balance....");
       }
       private void addprevilagedBanking() {
    	   System.out.println("Adding Previlaged Banking(Priority Customer) No Quee for Transaction ");
       }
       private void addWorkFromHomeServices() {
    	   System.out.println("adding Banking from Home service (Employee will come to home)");
       }
}
