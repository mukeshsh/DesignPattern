package com.nt.test;

import com.fpkt.service.FlipKartService;
import com.nt.dto.PaymentInfoDTO;
import com.nt.factory.FlipKartServiceFactory;

public class AdapterDPTest {

	public static void main(String[] args) {
     FlipKartService service=null;
     PaymentInfoDTO dto=null;
     //get flipkat service object
     service=FlipKartServiceFactory.getInstance();
     //prepare dto
     dto=new PaymentInfoDTO();
     dto.setItems(new String[] {"Shirt","Paint","T-Shirt","Under"});
     dto.setPrices(new float[] {3000,50000,5600,30000});
     dto.setBankName("SBI");
     dto.setCardNo(45555);
     //invoked the method
     System.out.println(service.shoppingAndPayment(dto));
     System.out.println("----------------------");
     System.out.println(service.shoppingAndPayment(dto));
	}

}
