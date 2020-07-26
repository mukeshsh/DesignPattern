package com.nt.builder;

import com.nt.foundation.StoneFoundation;
import com.nt.interior.MarbelAndGraniteInterior;
import com.nt.product.House;
import com.nt.roofing.SandStoneRoofing;
import com.nt.structure.TallStoneStructure;

public class MarbelHouseBuilder implements HouseBuilder {

	private House house;
	
	public MarbelHouseBuilder(House house) {
		System.out.println("MarbelHouseBuilder::1-param Constructor");
		this.house = house;
	}

	@Override
	public void buildBasement() {
    house.setFoundation(new StoneFoundation());
	}
	@Override
	public void buildStructure() {
     house.setStructure(new TallStoneStructure());
	}

	@Override
	public void buildRoofing() {
   house.setRoofing(new SandStoneRoofing());
	}

	@Override
	public void buildInterior() {
     house.setInterior(new MarbelAndGraniteInterior());
	}

	@Override
	public House buildHouse() {
		// TODO Auto-generated method stub
		return house;
	}

}
