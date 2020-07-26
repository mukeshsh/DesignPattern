package com.nt.factory;

import com.fpkt.service.FlipKartService;
import com.fpkt.service.FlipKartServiceImpl;

public class FlipKartServiceFactory {
     public static FlipKartService getInstance() {
    	 return new FlipKartServiceImpl();
     }
}
