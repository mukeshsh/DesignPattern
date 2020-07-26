package com.nt.factory;

import com.nt.comp.BadMinton;
import com.nt.comp.Cricket;
import com.nt.comp.Football;
import com.nt.comp.Hockey;
import com.nt.comp.Kabbadi;
import com.nt.comp.Player;
import com.nt.comp.Sport;
import com.nt.comp.SportType;
import com.nt.comp.VollyBall;

public class PlayerFactory {
	public static Player getInstance(String type) {
		Sport sport=null;
		Player player=null;
		//create objects
		if(type.equalsIgnoreCase(SportType.SPORT_TYPE_CRICKET))
			sport=new Cricket();
		else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_KABBADI))
			sport=new Kabbadi();
		else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_FOOTBALL))
			sport=new Football();
		else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_BADMINTON))
			sport=new BadMinton();
		else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_HOCKEY))
			sport=new Hockey();
		else if(type.equalsIgnoreCase(SportType.SPORT_TYPE_VOLLYBALL))
			sport=new VollyBall();
		else
			throw new IllegalArgumentException("Invalid Sport Type");
		//cricket target class object
		player=new Player();
		player.setSport(sport);
		//return object
		return player;
	}
}