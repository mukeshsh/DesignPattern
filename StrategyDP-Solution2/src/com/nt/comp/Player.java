package com.nt.comp;

public class Player {
    private Sport sport;
    
    public Player() {
    System.out.println("Player.Player()");
    }
    public void setSport(Sport sport) {
    	System.out.println("Player.setSport()");
    	this.sport=sport;
    }
	public void PlayGame() {
    	String equip=null;
    	//arrange equipment
    	equip=sport.equipment();
    	System.out.println("Playing Game Using ::"+equip);
    	}
}
