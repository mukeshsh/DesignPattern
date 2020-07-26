package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.DBCourseDAOImpl;
import com.nt.dao.DBtudentDAOImpl;

public class DBDAOFactory implements DAOFactory {

	@Override
	public DAO createDAO(String daoType) {
       DAO dao=null;
     if(daoType.equalsIgnoreCase("course")) {
    	 dao =new DBCourseDAOImpl();
     }
     else if(daoType.equalsIgnoreCase("student")) {
    	 dao=new DBtudentDAOImpl();
     }
     else {
    	 throw new IllegalArgumentException("Invalid Data Type");
     }
		return dao;
	}

}
