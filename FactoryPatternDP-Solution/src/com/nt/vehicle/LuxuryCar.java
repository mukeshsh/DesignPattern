package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class LuxuryCar implements Car {
       private Tyre tyre;
       
	public LuxuryCar(Tyre tyre) {
		System.out.println("LuxuryCar::1-param Constructor");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
       System.out.println("Driving Luxury Car Having"+tyre.info());
	}

}
