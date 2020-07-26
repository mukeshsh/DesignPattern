package com.nt.test;

import com.nt.dao.DAO;
import com.nt.factory.DAOFactory;
import com.nt.factory.DAOFactoryCreator;
import com.nt.factory.DBDAOFactory;
import com.nt.factory.ExcelDAOFactory;

public class AbstractFPTest {

	public static void main(String[] args) {
    DAO dao1=null,dao2=null;
    DAOFactory factory=null;
      factory=DAOFactoryCreator.buildFactory("db");
      dao1=factory.createDAO("course");
      dao2=factory.createDAO("student");
      dao1.insert();
      dao2.insert();
	}
}
