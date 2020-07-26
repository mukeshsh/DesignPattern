package com.nt.ext1;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanInputsDTO;

public class IccCricketerIdFinderCompImpl implements IccCricketerIdFinderComp {

	@Override
	public BatsmanIdDetailsDTO findBatsmanId(BatsmanInputsDTO dto) {
     BatsmanIdDetailsDTO idDTO=null;
     if(dto.getNickName().equalsIgnoreCase("sachin")){
    	 idDTO=new BatsmanIdDetailsDTO();
    	 idDTO.setBatsmanId(1001);
    	 idDTO.setNickName("sachin");
    	 idDTO.setCountry("india");
    	 idDTO.setFullName("Sachin Ramesh Tendulkar");
     }
     else if(dto.getNickName().equalsIgnoreCase("kohli")) {
    	 idDTO=new BatsmanIdDetailsDTO();
    	 idDTO.setBatsmanId(1002);
    	 idDTO.setNickName("kohli");
    	 idDTO.setCountry("india");
    	 idDTO.setFullName("Virat Kohli");
     }
     else if(dto.getNickName().equalsIgnoreCase("dhoni")) { 
    	 idDTO=new BatsmanIdDetailsDTO();
    	 idDTO.setBatsmanId(1003);
    	 idDTO.setNickName("dhoni");
    	 idDTO.setCountry("india");
    	 idDTO.setFullName("Mahendra Singh Dhoni");
     }
     else {
    	 throw new IllegalArgumentException("No Batsman with this nickName...");
     }
		
		return idDTO;
	}

}
