package com.nt.hiring;

public class HireJavaFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
     System.out.println("HireJavaFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
   System.out.println("HireJavaFresher.conductSystemTest()");
		return true;
	}

}
