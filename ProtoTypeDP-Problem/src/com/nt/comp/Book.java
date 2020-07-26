package com.nt.comp;

public class Book {
	private int bankId;
	private String bankName;

	public Book() {
		System.out.println("Book::0-param Constructor");
	}

	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "Book [bankId=" + bankId + ", bankName=" + bankName + "]";
	}

}
