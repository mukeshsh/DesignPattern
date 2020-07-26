package com.nt.comp;

public class FictionalBookCollection extends BooksCollection {
   
	public FictionalBookCollection() {
   System.out.println("FictionalBookCollection::0-param constructor");
	}
	@Override
	public void loadBook() {
      Book book=null;
      //collect these book from db s/w
      for(int i=0;i<=10;i++) {
    	  book=new Book();
    	  book.setBookId(i+1);
    	  book.setBookName("FI->Book"+i);
    	  getBooks().add(book);
      }
	}

}
