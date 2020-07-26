package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.tyre.MRFTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.SportsCar;

public class CarDealer3 {

	public static void main(String[] args) {
     System.out.println("Sports Car Dealer");
     Car car=null;
     Tyre tyre=null;
     tyre=new MRFTyre();
     car=CarFactory.getInstanceCar("sport");
     car.roadTest();
	}

}
