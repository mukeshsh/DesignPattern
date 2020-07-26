package com.nt.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.nt.comp.Player;
import com.nt.comp.Sport;

public class PlayerFactory {
  private static String sport_class;
  static {
	  InputStream is=null;
	  OutputStream os=null;
	  Properties props=null;
	  try {
		  //create InputStream to pointing properties file
		  is=new FileInputStream("src/com/nt/commons/management.properties");
		  //load properties file
		  props=new Properties();
		  props.load(is);
		  sport_class=props.getProperty("player.sport");
	  }
	  catch(FileNotFoundException fnfe) {
		  fnfe.printStackTrace();
	  }
	  catch(IOException ioe) {
		  ioe.printStackTrace();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
  }
  public static Player getInstance() {
	  Sport sport=null;
	  Player player=null;
	  Class c=null;
	  //create dependent class object
	  try {
		  c=Class.forName(sport_class);
		  sport=(Sport) c.newInstance();
		  //create target class object
		  player=new Player();
		  //assign dependent class object to target class object
		  player.setSport(sport);
	  }
	  catch(ClassNotFoundException cnf) {
		  cnf.printStackTrace();
	  }
	  catch(InstantiationException ie) {
		  ie.printStackTrace();
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  //return object
	   return player;
  }
}