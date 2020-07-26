package com.nt.comp;

import java.util.ArrayList;
import java.util.List;

public abstract class BooksCollection {
	private String type;
	private List<Book> books=new ArrayList<Book>();

	public BooksCollection() {
		System.out.println("BooksCollection::0-param Constructor");
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public abstract void loadBook();
	@Override
	public String toString() {
		return "BooksCollection [type=" + type + ", books=" + books + "]";
	}

}
