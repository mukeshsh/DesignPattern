package com.nt.cfgs;

import java.util.Enumeration;
import java.util.Properties;
import java.util.ResourceBundle;

import org.apache.log4j.PropertyConfigurator;

public class Log4jConfiguration {
    public static void configure() {
    	ResourceBundle bundle=null;
    	Properties props=null;
    	Enumeration<String> e=null;
    	try {
    		//locate log4j properties
    		bundle=ResourceBundle.getBundle("com/nt/commons/log4j");
    		//get all key and values..
    		props=new Properties();
    		e=bundle.getKeys();
    		while(e.hasMoreElements()) {
    			String key=e.nextElement();
    			String value=bundle.getString(key);
    			props.put(key, value);
    		}
    		//activate log4j
    		PropertyConfigurator.configure(props);
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    }
}
