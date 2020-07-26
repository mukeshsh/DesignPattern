package com.nt.sdp;

import com.nt.util.CommonsUtil;

public class Printer extends CommonsUtil{
	private static Printer INSTANCE;
	private static boolean isInstantiated=false;
	private static final long serialVersionUID=23454323141L;
	private Printer() {
		if(INSTANCE!=null)
			throw new IllegalArgumentException("Object is already existed");
		System.out.println("Printer::0-param Constructor");
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Printer.clone()");
		throw new CloneNotSupportedException("Cloning is not allow in this singleton java class");
	}
	public Object readResolve() {
		return new CloneNotSupportedException();
	}
	public static Printer getInstance() {
		return INSTANCE;
	}
}
