package com.nt.factory;

import com.nt.tyre.AppoloTyre;
import com.nt.tyre.MRFTyre;
import com.nt.tyre.MechalinTyre;
import com.nt.tyre.Tyre;
import com.nt.vehicle.Car;
import com.nt.vehicle.LuxuryCar;
import com.nt.vehicle.SportsCar;
import com.nt.vehicle.StandarsCar;

public class CarFactory{
    //static factory method having static factory logic
	public static Car getInstanceCar(String carType) {
		Car car=null;
		Tyre tyre=null;
		if(carType.equalsIgnoreCase(CarType.Type_Standard)) {
			tyre=new MechalinTyre();
			car=new StandarsCar(tyre);
		}
		else if(carType.equalsIgnoreCase(CarType.Type_Luxury)) {
			tyre=new AppoloTyre();
		car=new LuxuryCar(tyre);
		}
		else if(carType.equalsIgnoreCase(CarType.Type_Sports)) {
			tyre=new MRFTyre();
			car=new SportsCar(tyre);
		}
		else {
			throw new IllegalArgumentException("Invalid Car Name");
		}
		return car;
	}
}
