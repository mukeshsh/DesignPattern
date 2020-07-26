package com.nt.ext2;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanProfileDTO;

public class IccCricketerProfileFinderCompImpl implements IccCricketerProfileFinderComp {

	@Override
	public BatsmanProfileDTO findBatsmanProfile(BatsmanIdDetailsDTO dto1) {
    BatsmanProfileDTO profileDTO=null;
    if(dto1.getBatsmanId()==1001) {
    	profileDTO=new BatsmanProfileDTO();
    	profileDTO.setBatsmanId(dto1.getBatsmanId());
    	profileDTO.setFullName(dto1.getFullName());
    	profileDTO.setCountry(dto1.getCountry());
    	profileDTO.setMatcheCount(463);
    	profileDTO.setCenturiesCount(100);
    	profileDTO.setHalfCenturies(96);
    	profileDTO.setTotalRuns(18900);
    	profileDTO.setStrikeRate(86.34f);
    	profileDTO.setHighestScore("200*");
    }
    else if(dto1.getBatsmanId()==1002) {
    	profileDTO=new BatsmanProfileDTO();
    	profileDTO.setBatsmanId(dto1.getBatsmanId());
    	profileDTO.setFullName(dto1.getFullName());
    	profileDTO.setCountry(dto1.getCountry());
    	profileDTO.setMatcheCount(200);
    	profileDTO.setCenturiesCount(70);
    	profileDTO.setHalfCenturies(80);
    	profileDTO.setTotalRuns(18900);
    	profileDTO.setStrikeRate(98.89f);
    	profileDTO.setHighestScore("183*");
    }
    else if(dto1.getBatsmanId()==1003) {
    	profileDTO=new BatsmanProfileDTO();
    	profileDTO.setBatsmanId(dto1.getBatsmanId());
    	profileDTO.setFullName(dto1.getFullName());
    	profileDTO.setCountry(dto1.getCountry());
    	profileDTO.setMatcheCount(400);
    	profileDTO.setCenturiesCount(50);
    	profileDTO.setHalfCenturies(76);
    	profileDTO.setTotalRuns(12000);
    	profileDTO.setStrikeRate(94.03f);
    	profileDTO.setHighestScore("183*");
    }
    else {
    	throw new IllegalArgumentException("Invalid Batsman Id");
    }
		return profileDTO;
	}

}
