package com.nt.dto;

import java.io.Serializable;

public class BatsmanProfileDTO implements Serializable{
	private int batsmanId;
	private String fullName;
	private  String country;
	private int totalRuns;
	private int matcheCount;
	private int centuriesCount;
	private int HalfCenturies;
	public float strikeRate;
	public String highestScore;
	public int getBatsmanId() {
		return batsmanId;
	}
	public void setBatsmanId(int batsmanId) {
		this.batsmanId = batsmanId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	public int getMatcheCount() {
		return matcheCount;
	}
	public void setMatcheCount(int matcheCount) {
		this.matcheCount = matcheCount;
	}
	public int getCenturiesCount() {
		return centuriesCount;
	}
	public void setCenturiesCount(int centuriesCount) {
		this.centuriesCount = centuriesCount;
	}
	public int getHalfCenturies() {
		return HalfCenturies;
	}
	public void setHalfCenturies(int halfCenturies) {
		HalfCenturies = halfCenturies;
	}
	public float getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(float strikeRate) {
		this.strikeRate = strikeRate;
	}
	public String getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(String highestScore) {
		this.highestScore = highestScore;
	}
	
}
