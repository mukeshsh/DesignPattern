package com.nt.hiring;

public interface HireFresher {
  public default boolean conductApptitudeTest() {
	  System.out.println("HireFresher.conductApptitudeTest()");
	  return true;
  }
  public default boolean conductGDTest() {
	  System.out.println("HireFresher.GDTest()");
	  return true;
  }
  public default boolean conductHRInterview() {
	  System.out.println("HireFresher.conductHRInterview()");
	  return true;
  }
  public abstract boolean conductTechnicalTest();
  public abstract boolean conductSystemTest();
  
  //Template method design pattern
  public default boolean recruitmentProcess() {
	  System.out.println("HireFresher.recruitmentProcess()");
	  boolean flag=false;
	  flag=conductApptitudeTest();
	  if(flag)
		  flag=conductGDTest();
	   if(flag)
		   flag=conductTechnicalTest();
	   if(flag)
		   flag=conductSystemTest();
	   if(flag)
		   flag=conductHRInterview();
	   return flag;
  }
}
