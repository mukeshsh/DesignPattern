package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hiring.HireFresher;

public class RecruiterTest {

	public static void main(String[] args) {
      HireFresher fresher=null;
      fresher=HireFresherFactory.getInstance("dotnet");
      fresher.recruitmentProcess();
	}

}
