package com.nt.vo;

public class BatsmanProfileVO {
	private String batsmanId;
	private String fullName;
	private  String country;
	private String totalRuns;
	private String matcheCount;
	private String centuriesCount;
	private String HalfCenturies;
	public String strikeRate;
	public String highestScore;
	public String getBatsmanId() {
		return batsmanId;
	}
	public void setBatsmanId(String batsmanId) {
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
	public String getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(String totalRuns) {
		this.totalRuns = totalRuns;
	}
	public String getMatcheCount() {
		return matcheCount;
	}
	public void setMatcheCount(String matcheCount) {
		this.matcheCount = matcheCount;
	}
	public String getCenturiesCount() {
		return centuriesCount;
	}
	public void setCenturiesCount(String centuriesCount) {
		this.centuriesCount = centuriesCount;
	}
	public String getHalfCenturies() {
		return HalfCenturies;
	}
	public void setHalfCenturies(String halfCenturies) {
		HalfCenturies = halfCenturies;
	}
	public String getStrikeRate() {
		return strikeRate;
	}
	public void setStrikeRate(String strikeRate) {
		this.strikeRate = strikeRate;
	}
	public String getHighestScore() {
		return highestScore;
	}
	public void setHighestScore(String highestScore) {
		this.highestScore = highestScore;
	}	
}
