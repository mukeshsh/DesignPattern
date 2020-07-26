package com.nt.factory;

import com.nt.hiring.HireDotNetFresher;
import com.nt.hiring.HireFresher;
import com.nt.hiring.HireJavaFresher;
import com.nt.hiring.HirePHPFresher;

public class HireFresherFactory {
    public static HireFresher getInstance(String type) {
    	HireFresher fresher=null;
    	if(type.equalsIgnoreCase("java"))
    		fresher=new HireJavaFresher();
    	else if(type.equalsIgnoreCase("php"))
    		fresher=new HirePHPFresher();
    	else if(type.equalsIgnoreCase("dotNet"))
    		fresher=new HireDotNetFresher();
    	else
    		throw new IllegalArgumentException("Invlaid");
    	return fresher;
    }
}
