package com.nt.vehicle;

import com.nt.tyre.Tyre;

public class SportsCar implements Car {
       private Tyre tyre;
       
	public SportsCar(Tyre tyre) {
		System.out.println("SportsCar::1-param Constructor");
		this.tyre = tyre;
	}

	@Override
	public void roadTest() {
       System.out.println("Driving Sports Car Having"+tyre.info());
	}

}
