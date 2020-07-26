package com.nt.locator;

import java.util.HashMap;
import java.util.Map;

import com.nt.sessionfacade.IccCricketerDetailsFinderFacade;
import com.nt.sessionfacade.IccCricketerDetailsFinderFacadeImpl;

public class CricketerDetailsServiceLocator {
   private static CricketerDetailsServiceLocator locator=null;
   private Map<String, IccCricketerDetailsFinderFacade> cache=new HashMap<String, IccCricketerDetailsFinderFacade>();
   private CricketerDetailsServiceLocator() {
   }
   public static CricketerDetailsServiceLocator getInstance() {
	   if(locator==null) {
		   synchronized(CricketerDetailsServiceLocator.class) {
			   if(locator==null)
				   locator=new CricketerDetailsServiceLocator();
		   }
	   }
	   return locator;
   }
   public IccCricketerDetailsFinderFacade getService(String jndiName) {
	   IccCricketerDetailsFinderFacade comp=null;
	   if(!cache.containsKey(jndiName)) {
		   comp=new IccCricketerDetailsFinderFacadeImpl();
		   cache.put(jndiName, comp);
	   }
	   else {
		   comp=cache.get(jndiName);
	   }
	   return comp;
   }
}
