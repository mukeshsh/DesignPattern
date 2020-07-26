package com.nt.comp;

public class Player {
    private Cricket cricket;

	public Player(Cricket cricket) {
		System.out.println("Player::1-param construcor");
		this.cricket = cricket;
	}
    public void PlayGame() {
    	String equip=null;
    	//arrange equipment
    	equip=cricket.equipment();
    	System.out.println("Playing Game Using ::"+equip);
    	}
}
