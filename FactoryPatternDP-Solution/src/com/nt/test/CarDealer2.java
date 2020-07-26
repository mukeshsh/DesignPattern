package com.nt.test;

import com.nt.factory.CarFactory;
import com.nt.tyre.AppoloTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.StandarsCar;

public class CarDealer2 {

	public static void main(String[] args) {
     System.out.println("Luxury Car Dealer");
     Car car=null;
     Tyre tyre=null;
     tyre=new AppoloTyre();
     car=CarFactory.getInstanceCar("luxuRY");
     car.roadTest();
	}

}
