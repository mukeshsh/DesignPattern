package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class StandarsCar implements Car {
       private Tyre tyre;
       
	public StandarsCar(Tyre tyre) {
		System.out.println("StandardsCar::1-param Constructor");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
       System.out.println("Driving Standards Car Having"+tyre.info());
	}

}
