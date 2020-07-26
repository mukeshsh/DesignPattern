package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAOImpl;
import com.nt.dao.DBtudentDAOImpl;

public class DBDAOFactory {
   public static DAO createDAO(String type) {
	   DAO dao=null;
	   if(type.equalsIgnoreCase("student"))
		   dao=new DBtudentDAOImpl();
	   else if(type.equalsIgnoreCase("course"))
		   dao=new DBCourseDAOImpl();
	   else
		   throw new IllegalArgumentException("Invalid Entering input::");
	   return dao;
   }
}
