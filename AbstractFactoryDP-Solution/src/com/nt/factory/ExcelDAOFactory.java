package com.nt.factory;

import com.nt.dao.DAO;
import com.nt.dao.ExcelCourseDAOImpl;
import com.nt.dao.ExcelStudentDAOImpl;

public class ExcelDAOFactory implements DAOFactory {

	@Override
	public DAO createDAO(String daoType) {
     DAO dao=null;
     if(daoType.equalsIgnoreCase("course")) {
    	 dao =new ExcelCourseDAOImpl();
     }
     else if(daoType.equalsIgnoreCase("student")) {
    	 dao=new ExcelStudentDAOImpl();
     }
     else {
    	 throw new IllegalArgumentException("Invalid Data Type");
     }
		return dao;
	}

}
