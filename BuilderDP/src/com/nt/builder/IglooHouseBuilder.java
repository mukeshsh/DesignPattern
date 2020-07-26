package com.nt.builder;

import com.nt.foundation.IceFoundation;
import com.nt.interior.IceInterior;
import com.nt.product.House;
import com.nt.roofing.IceRoofing;
import com.nt.structure.IceStructure;

public class IglooHouseBuilder implements HouseBuilder {
	private House house;

	public IglooHouseBuilder(House house) {
		System.out.println("IglooHouseBuilder::1-param Constructor");
		this.house = house;
	}

	@Override
	public void buildBasement() {
		house.setFoundation(new IceFoundation());
	}

	@Override
	public void buildStructure() {
		house.setStructure(new IceStructure());
	}

	@Override
	public void buildRoofing() {
		house.setRoofing(new IceRoofing());
	}

	@Override
	public void buildInterior() {
		house.setInterior(new IceInterior());
	}

	@Override
	public House buildHouse() {
		return house;
	}

}
