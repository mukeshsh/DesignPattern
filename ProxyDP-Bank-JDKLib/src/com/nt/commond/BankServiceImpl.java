package com.nt.commond;

public final class BankServiceImpl implements BankService {
  public BankServiceImpl() {
   System.out.println("BankServiceImpl::0-param Constructor");
  }
	@Override
	public final String withdraw(int acno, float amt) {
		return "Withdraw amount Rs::  "+amt +"  from account no:  "+acno;
	}

	@Override
	public final String deposite(int acno, float amt) {
		return "Deposite amount Rs::  "+amt+"  to Account no:  "+acno;
	}

}
