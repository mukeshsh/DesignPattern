package com.nt.test;

import com.nt.factory.HouseFactory;
import com.nt.product.House;

public class BuilderDPTest {

	public static void main(String[] args) {
     House house=null;
     System.out.println("BuilderDPTest.main()");
     //get
     house=HouseFactory.getInstance("marble");
     System.out.println(house);
	}

}
