package com.nt.dto;

import java.io.Serializable;

public class CricketerProfileDTO  implements Serializable{
	private long cricketerId;
	private String cricketerName;
	private  String nation;
	private String  state;
	private long totalRuns;
	private  long totalIninings;
	private float battingAvg;
	private float bowlingAvg;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(long totalRuns) {
		this.totalRuns = totalRuns;
	}
	public long getTotalIninings() {
		return totalIninings;
	}
	public void setTotalIninings(long totalIninings) {
		this.totalIninings = totalIninings;
	}
	public float getBattingAvg() {
		return battingAvg;
	}
	public void setBattingAvg(float battingAvg) {
		this.battingAvg = battingAvg;
	}
	public float getBowlingAvg() {
		return bowlingAvg;
	}
	public void setBowlingAvg(float bowlingAvg) {
		this.bowlingAvg = bowlingAvg;
	}
	
}
