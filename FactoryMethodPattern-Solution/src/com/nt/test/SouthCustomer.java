package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.ChennaiBajajBikeFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		System.out.println("South Customer Bike");
		BajajBikeFactory factory=null;
		BajajBike bike=null;
		//
		factory=new ChennaiBajajBikeFactory();
		bike=factory.manufactureBike("discover");
		bike.drive();
				}

} 
