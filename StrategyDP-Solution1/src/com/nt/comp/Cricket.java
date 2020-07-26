package com.nt.comp;

public class Cricket implements Sport {
    public Cricket() {
     System.out.println("Cricket::0-param Constructor");
    }
    public String equipment() {
    	return "Bat,Bal,Helmet,Pads,Gloves...";
    }
}
