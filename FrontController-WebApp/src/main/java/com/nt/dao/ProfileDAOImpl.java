package com.nt.dao;

import java.util.Date;

import com.nt.bo.ProfileBO;

public class ProfileDAOImpl implements ProfileDAO {

	@Override
	public ProfileBO getProfileById(int id) {
		ProfileBO bo=null;
		if(id==1) {
			bo=new ProfileBO();
			bo.setId(id);
			bo.setName("Mukesh");
			bo.setAddrs("Rajapur No.1");
			bo.setDob(new Date(1995,30,06));
			bo.setEmailId("patelmukesh325@gmail.com");
			bo.setMobileNo(9559037858L);
		}
		return bo;
	}
}
