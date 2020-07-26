package com.nt.test;

import com.nt.bike.BajajBike;
import com.nt.factory.BajajBikeFactory;
import com.nt.factory.NagpurBajajBikeFactory;

public class NorthCustomer {

	public static void main(String[] args) {
		System.out.println("North Customer Bike");
		BajajBikeFactory factory=null;
		BajajBike bike=null;
		//
		factory=new NagpurBajajBikeFactory();
		bike=factory.manufactureBike("platina");
		bike.drive();
				}

}
