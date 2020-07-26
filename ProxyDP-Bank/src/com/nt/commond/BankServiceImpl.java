package com.nt.commond;

public class BankServiceImpl implements BankService {
  public BankServiceImpl() {
   System.out.println("BankServiceImpl::0-param Constructor");
  }
	@Override
	public String withdraw(int acno, float amt) {
		return "Withdraw amount Rs::  "+amt +"  from account no:  "+acno;
	}

	@Override
	public String deposite(int acno, float amt) {
		return "Deposite amount Rs::  "+amt+"  to Account no:  "+acno;
	}

}
