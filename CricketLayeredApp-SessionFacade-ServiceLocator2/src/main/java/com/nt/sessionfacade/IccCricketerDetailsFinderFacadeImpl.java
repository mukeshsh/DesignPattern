package com.nt.sessionfacade;

import com.nt.dto.BatsmanIdDetailsDTO;
import com.nt.dto.BatsmanInputsDTO;
import com.nt.dto.BatsmanProfileDTO;
import com.nt.ext1.IccCricketerIdFinderComp;
import com.nt.ext1.IccCricketerIdFinderCompImpl;
import com.nt.ext2.IccCricketerProfileFinderComp;
import com.nt.ext2.IccCricketerProfileFinderCompImpl;

public class IccCricketerDetailsFinderFacadeImpl implements IccCricketerDetailsFinderFacade {

	@Override
	public BatsmanProfileDTO getCricketerDetails(BatsmanInputsDTO ipDTO) {
     BatsmanProfileDTO profileDTO=null;
     BatsmanIdDetailsDTO idDTO=null;
     IccCricketerIdFinderComp idComp=null;
     IccCricketerProfileFinderComp profileComp=null;
     //use external services
     idComp=new IccCricketerIdFinderCompImpl();
     idDTO=idComp.findBatsmanId(ipDTO);
     //
     profileComp=new IccCricketerProfileFinderCompImpl();
     profileDTO=profileComp.findBatsmanProfile(idDTO);
		return profileDTO;
	}

}
