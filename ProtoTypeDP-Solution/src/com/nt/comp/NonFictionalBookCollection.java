package com.nt.comp;

public class NonFictionalBookCollection extends BooksCollection {

	public NonFictionalBookCollection() {
     System.out.println("NonFictionalBookCollection::0-param Constructor");
	}
	@Override
	public void loadBook() {
     Book book =null;
     //get book from db
     for(int i=0;i<=10;i++) {
    	 book=new Book();
    	 book.setBookId(i+1);
    	 book.setBookName("NFN->Book"+i);
    	 getBooks().add(book);
     }
	}

}
