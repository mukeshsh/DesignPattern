package com.nt.ext1;

import com.nt.dto.CricketerIdDTO;

public class IccCricketerIdFinderImpl implements IccCricketerIdFinder {

	@Override
	public CricketerIdDTO fetchIdDetailsByName(String name) {
		 CricketerIdDTO  iDTO=null;
		  iDTO=new CricketerIdDTO();
		  if(name.equalsIgnoreCase("sachin")) {
			  iDTO.setCricketerId(1001);
			  iDTO.setCricketerName("sachin Tendulkar");
			  iDTO.setNation("india");
		  }
		  else if(name.equalsIgnoreCase("kohli")) {
			  iDTO.setCricketerId(1002);
			  iDTO.setCricketerName("virat kohli");
			  iDTO.setNation("india");
		  }
		  else if(name.equalsIgnoreCase("dhoni")) {
			  iDTO.setCricketerId(1003);
			  iDTO.setCricketerName("MS Dhoni");
			  iDTO.setNation("india");
		  }
		  else {
			  throw new IllegalArgumentException("Invlid CRicketer name");
		  }
		return iDTO;
	}//metod

}//class
