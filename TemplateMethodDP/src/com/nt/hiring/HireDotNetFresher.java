package com.nt.hiring;

public class HireDotNetFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
     System.out.println("HireDotNetFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
   System.out.println("HireDotNetFresher.conductSystemTest()");
		return true;
	}

}
