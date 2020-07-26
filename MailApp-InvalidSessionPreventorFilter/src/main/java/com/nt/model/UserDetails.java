package com.nt.model;

public class UserDetails {
   private String uname;
   private String pwd;
   
public UserDetails() {
	System.out.println("UserDetails::0-param constructor");
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
   
}
