package com.nt.bo;

public abstract class BaseEmployeeBO {
   private String ename;
   private String eadd;
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEadd() {
	return eadd;
}
public void setEadd(String eadd) {
	this.eadd = eadd;
}
@Override
public String toString() {
	return "BaseEmployeeBO [ename=" + ename + ", eadd=" + eadd + "]";
}
   
}
