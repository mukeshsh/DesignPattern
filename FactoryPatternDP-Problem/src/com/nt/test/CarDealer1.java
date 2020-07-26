package com.nt.test;

import com.nt.tyre.MechalinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxuryCar;

public class CarDealer1 {

	public static void main(String[] args) {
     System.out.println("Luxury Car Dealer");
     Car car=null;
     Tyre tyre=null;
     tyre=new MechalinTyre();
     car=new LuxuryCar(tyre);
     car.roadTest();
	}

}
