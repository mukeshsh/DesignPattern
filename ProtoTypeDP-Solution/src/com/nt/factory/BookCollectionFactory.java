package com.nt.factory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.nt.comp.Book;
import com.nt.comp.BooksCollection;
import com.nt.comp.FictionalBookCollection;
import com.nt.comp.NonFictionalBookCollection;

public class BookCollectionFactory {
	private static Map<String, BooksCollection> cache=new HashMap<String, BooksCollection>();
	static {
		BooksCollection fcollection=null,nfcollection=null;
		fcollection=new FictionalBookCollection();
		fcollection.loadBook();
		
		nfcollection=new NonFictionalBookCollection();
		nfcollection.loadBook();
		
		cache.put(BookType.FICTIONAL, fcollection);
		cache.put(BookType.NONFICTIONAL, nfcollection);
	}
	public static BooksCollection getInstance(String type) {
		BooksCollection cloneCollection=null,orginalCollection=null;
		List<Book> bookList=null;
		Book book=null;
		
		orginalCollection=cache.get(type);
		//cloning
		cloneCollection=cache.get(type);
		//also copy inner objects to reflect deep cloning
		bookList=new ArrayList<Book>();
		for(Book book1:orginalCollection.getBooks()) {
			book=new Book();
			book.setBookId(book1.getBookId());
			book.setBookName(book1.getBookName());
			bookList.add(book);			
		}
		cloneCollection.setBooks(bookList);
		cloneCollection.setType(type);
		return cloneCollection;
	}
}
