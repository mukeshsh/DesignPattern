package com.nt.factory;

public class DAOFactoryCreator {
   public static DAOFactory buildFactory(String createFactory) {
	   DAOFactory factory=null;
	   if(createFactory.equalsIgnoreCase("excel")) 
		   factory=new ExcelDAOFactory();
	   else if(createFactory.equalsIgnoreCase("db")) 
		   factory=new DBDAOFactory();
	   else
		   throw new IllegalArgumentException("Invalid factory type");
	      return factory;
   }
}
