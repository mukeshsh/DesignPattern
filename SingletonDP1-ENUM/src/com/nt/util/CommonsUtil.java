package com.nt.util;

import java.io.Serializable;

public class CommonsUtil implements Cloneable, Serializable {
	@Override
	   public  Object clone() throws CloneNotSupportedException {
		System.out.println("CommonsUtil.clone()");
		return super.clone();
	}
}
