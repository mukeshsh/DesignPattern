package com.nt.delegate;

import com.nt.dto.BatsmanInputsDTO;
import com.nt.dto.BatsmanProfileDTO;
import com.nt.locator.CricketerDetailsServiceLocator;
import com.nt.sessionfacade.IccCricketerDetailsFinderFacade;
import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;

public class CricketerDetailsDelegateImpl implements CricketerDetailsDelegate {

	@Override
	public BatsmanProfileVO findCricketerDetails(BatsmanInputsVO ipVO) {
      BatsmanInputsDTO ipDTO=null;
      CricketerDetailsServiceLocator locator=null;
      IccCricketerDetailsFinderFacade facade=null;
      BatsmanProfileDTO profileDTO=null;
      BatsmanProfileVO profileVO=null;
		//converts inputsVO to InputsDTO obj
		ipDTO=new BatsmanInputsDTO();
		ipDTO.setNickName(ipVO.getNickName());
		ipDTO.setCountry(ipVO.getCountry());
		//get ServiceLocator object
		locator=CricketerDetailsServiceLocator.getInstance();
		//get sessionfacade object
		facade=locator.getService("serviceJndi");
		//gets batsman profile
		profileDTO=facade.getCricketerDetails(ipDTO);
		//convert profileDTO to profileVO
		profileVO=new BatsmanProfileVO();
		profileVO.setBatsmanId(String.valueOf(profileDTO.getBatsmanId()));
		profileVO.setFullName(profileDTO.getFullName());
		profileVO.setCountry(profileDTO.getCountry());
		profileVO.setHighestScore(profileDTO.getHighestScore());
		profileVO.setCenturiesCount(String.valueOf(profileDTO.getCenturiesCount()));
		profileVO.setHalfCenturies(String.valueOf(profileDTO.getHalfCenturies()));
		profileVO.setMatcheCount(String.valueOf(profileDTO.getMatcheCount()));
		profileVO.setStrikeRate(String.valueOf(profileDTO.getStrikeRate()));
		profileVO.setTotalRuns(String.valueOf(profileDTO.getTotalRuns()));
		return profileVO;
	}

}
