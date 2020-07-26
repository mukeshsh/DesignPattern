package com.nt.service;

import com.nt.dto.CricketerProfileDTO;
import com.nt.locator.IccCricketerSessionFacadeLocator;
import com.nt.sessionfacade.IccCricketerProfileSessionFacade;
import com.nt.vo.CricketerProfileVO;

public class CrickBuzzProfileMgmtServiceImpl implements CrickBuzzProfileMgmtService {

	@Override
	public CricketerProfileVO fetchCricketerProfile(String name) {
		IccCricketerSessionFacadeLocator locator=null;
		IccCricketerProfileSessionFacade  facade=null;
		CricketerProfileDTO  profileDTO=null;
		CricketerProfileVO profileVO=null;
		//get use Service Locator
		locator=IccCricketerSessionFacadeLocator.getInstance();
		//get SessionFacade obj ref
		facade=locator.getSessionFacade("crickterJndi");
		//invoke method
		profileDTO=facade.delegate(name);
		//convert profileDTO to ProfileVO
		profileVO=new CricketerProfileVO();
		profileVO.setCricketerId(String.valueOf(profileDTO.getCricketerId()));
		profileVO.setCricketerName(profileDTO.getCricketerName());
		profileVO.setNation(profileDTO.getNation());
		profileVO.setState(profileDTO.getState());
		profileVO.setTotalRuns(String.valueOf(profileDTO.getTotalRuns()));
		profileVO.setTotalIninings(String.valueOf(profileDTO.getTotalIninings()));
		profileVO.setBattingAvg(String.valueOf(profileDTO.getBattingAvg()));
		profileVO.setBowlingAvg(String.valueOf(profileDTO.getBowlingAvg()));
		return profileVO;
	}

}
