package com.nt.factory;

import com.nt.comp.Cricket;
import com.nt.comp.Player;

public class PlayerFactory {
	public static Player getInstance() {
		Cricket cricket=null;
		Player player=null;
		//cricket objects
		cricket=new Cricket();
		player=new Player(cricket);
		return player;
	}
}