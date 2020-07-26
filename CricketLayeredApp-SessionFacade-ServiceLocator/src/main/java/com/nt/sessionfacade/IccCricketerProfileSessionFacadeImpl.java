package com.nt.sessionfacade;

import com.nt.dto.CricketerIdDTO;
import com.nt.dto.CricketerProfileDTO;
import com.nt.ext1.IccCricketerIdFinder;
import com.nt.ext1.IccCricketerIdFinderImpl;
import com.nt.ext2.IccCricketerProfileFinder;
import com.nt.ext2.IccCricketerProfileFinderImpl;

public class IccCricketerProfileSessionFacadeImpl implements IccCricketerProfileSessionFacade {

	@Override
	public CricketerProfileDTO delegate(String name) {
		IccCricketerIdFinder   extComp1=null;
		IccCricketerProfileFinder extComp2=null;
		CricketerIdDTO  idDTO=null;
		CricketerProfileDTO  profileDTO=null;
		//use Ext Comp1
		extComp1=new IccCricketerIdFinderImpl();
		idDTO=extComp1.fetchIdDetailsByName(name);
		//use Ext comp1
		extComp2=new IccCricketerProfileFinderImpl();
		profileDTO=extComp2.fetchCricketerById(idDTO);
		return profileDTO;
	}

}
