package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.sessionfacade.IccCricketerProfileSessionFacade;
import com.nt.sessionfacade.IccCricketerProfileSessionFacadeImpl;

public class IccCricketerSessionFacadeLocator {
	private  static  IccCricketerSessionFacadeLocator  INSTANCE=null;
	private Map<String,IccCricketerProfileSessionFacade>  cache=null;
	
	private IccCricketerSessionFacadeLocator() {
		cache=new HashMap();
	}
	
	public   static  IccCricketerSessionFacadeLocator  getInstance() {
		 if(INSTANCE==null)
			 INSTANCE=new IccCricketerSessionFacadeLocator();
		 
		 return INSTANCE;
	}
	
	public   IccCricketerProfileSessionFacade  getSessionFacade(String jndi) {
		 IccCricketerProfileSessionFacade facade=null;
		    if(!cache.containsKey(jndi)) {
              facade=new IccCricketerProfileSessionFacadeImpl();
              cache.put(jndi, facade);
		    }
		    return  cache.get(jndi);
	}
	

}

