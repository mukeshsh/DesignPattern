package com.nt.dto;

import java.io.Serializable;

public class CricketerIdDTO implements Serializable {
	private long cricketerId;
	private String cricketerName;
	private  String nation;
	public long getCricketerId() {
		return cricketerId;
	}
	public void setCricketerId(long cricketerId) {
		this.cricketerId = cricketerId;
	}
	public String getCricketerName() {
		return cricketerName;
	}
	public void setCricketerName(String cricketerName) {
		this.cricketerName = cricketerName;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
}
