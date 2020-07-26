package com.nt.hiring;

public class HirePHPFresher implements HireFresher {

	@Override
	public boolean conductTechnicalTest() {
     System.out.println("HirePHPFresher.conductTechnicalTest()");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
   System.out.println("HirePHPFresher.conductSystemTest()");
		return true;
	}

}
