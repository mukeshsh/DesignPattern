package com.nt.factory;

import com.nt.builder.ConcreteAndBrickHouseBuilder;
import com.nt.builder.HouseBuilder;
import com.nt.builder.IglooHouseBuilder;
import com.nt.builder.MarbelHouseBuilder;
import com.nt.builder.WoodenHouseBuilder;
import com.nt.director.CivilEngineer;
import com.nt.product.House;

public class HouseFactory {
  public static House getInstance(String houseType) {
	  CivilEngineer engineer=null;
	  House house=null;
	  HouseBuilder builder=null;
	  if(houseType.equalsIgnoreCase("concrete"))
		 builder=new ConcreteAndBrickHouseBuilder(new House());
	  else if(houseType.equalsIgnoreCase("wooden"))
		  builder=new WoodenHouseBuilder(new House());
	  else if(houseType.equalsIgnoreCase("marble"))
		  builder=new MarbelHouseBuilder(new House());
		  else if(houseType.equalsIgnoreCase("ice"))
			  builder=new IglooHouseBuilder(new House());
		  else
			  throw new IllegalArgumentException("Invalid House Type");
	    engineer=new CivilEngineer(builder);
	    house=engineer.constructHouse();
	    return house;
  }
}
