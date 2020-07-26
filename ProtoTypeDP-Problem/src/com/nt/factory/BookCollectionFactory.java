package com.nt.factory;

import com.nt.comp.BooksCollection;
import com.nt.comp.FictionalBookCollection;
import com.nt.comp.NonFictionalBookCollection;

public class BookCollectionFactory {
	public static BooksCollection getInstance(String type) {
		BooksCollection collection=null;
		if(type.equalsIgnoreCase(BookType.FICTIONAL)) {
			collection=new FictionalBookCollection();
			collection.loadBook();
		}
		else if(type.equalsIgnoreCase(BookType.NONFICTIONAL)) {
			collection=new NonFictionalBookCollection();
			collection.loadBook();
		}
		else 
			throw new IllegalArgumentException("Invalid Collection Type");
		return collection;
	}
}
