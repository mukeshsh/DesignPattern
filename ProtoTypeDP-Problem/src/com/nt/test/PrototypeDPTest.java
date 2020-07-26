package com.nt.test;

import com.nt.comp.BooksCollection;
import com.nt.factory.BookCollectionFactory;
import com.nt.factory.BookType;

public class PrototypeDPTest {

	public static void main(String[] args) {
    BooksCollection fcollection1=null,fcollection2=null,nfcollection1=null,nfcollection2=null;
    fcollection1=BookCollectionFactory.getInstance(BookType.FICTIONAL);
    System.out.println(fcollection1);
    System.out.println("...............................");
    fcollection2=BookCollectionFactory.getInstance(BookType.FICTIONAL);
    System.out.println(fcollection2);
    System.out.println("====================================");
    nfcollection1=BookCollectionFactory.getInstance(BookType.NONFICTIONAL);
    System.out.println(nfcollection1);
    System.out.println("...............................");
    nfcollection2=BookCollectionFactory.getInstance(BookType.NONFICTIONAL);
    System.out.println(nfcollection2);
   
	}

}
