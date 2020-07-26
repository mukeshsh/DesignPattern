package com.nt.test;

import com.fpkt.service.FlipKartService;
import com.nt.factory.FlipKartServiceFactory;

public class AdapterDPTest {

	public static void main(String[] args) {
     FlipKartService service=null;
     //get flipkat service object
     service=FlipKartServiceFactory.getInstance();
     //invoked the method
     System.out.println(service.shoppingAndPayment(new String[] {"shirt","trouser","shoe","gold"},new float[] {2000,3000,5000,300000},1234567, "ICICI"));
     System.out.println("----------------------");
     System.out.println(service.shoppingAndPayment(new String[] {"Shirts"}, new float[] {40000}, 1325436, "axis"));
	}

}
