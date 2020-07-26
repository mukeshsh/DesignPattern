package com.nt.factory;

import com.nt.bike.BajajBike;
import com.nt.bike.DiscoverBike;
import com.nt.bike.PlatinaBike;
import com.nt.bike.PulsorBike;

public class ChennaiBajajBikeFactory extends BajajBikeFactory {
       public  void paint() {
    	   System.out.println("Painting Bike...");
       }
       public  void assemble() {
    	   System.out.println("Assemble Bike....");
       }
       public  void roadTest() {
    	   System.out.println("Road Test the Bike.....");
       }
       public void oiling() {
    	   System.out.println("Oiling the bike......");
       }
       public  BajajBike buildBike(String model) {
    	   BajajBike bike=null;
    	   if(model.equalsIgnoreCase("pulsor")) {
    		   bike=new PulsorBike();
    		   System.out.println("Manufacturing Pulsor Bike");
    	   }
    	   else if(model.equalsIgnoreCase("platina")) {
    		   bike=new PlatinaBike();
    		   System.out.println("Manufacturing Platina Bike");
    	   }
    	   else if(model.equalsIgnoreCase("discover")) {
    		   bike=new DiscoverBike();
    		   System.out.println("Manufacturing Discover Bike");
    	   }
    	   else {
    		   throw new IllegalArgumentException("invalid car Name::");
    	   }
    	   return bike;
       }
       
}
