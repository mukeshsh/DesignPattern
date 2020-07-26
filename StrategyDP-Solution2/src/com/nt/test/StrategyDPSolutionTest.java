package com.nt.test;

import com.nt.comp.Player;
import com.nt.comp.SportType;
import com.nt.factory.PlayerFactory;

public class StrategyDPSolutionTest {

	public static void main(String[] args) {
     Player player=null;
     //get player
     player=PlayerFactory.getInstance();
     //invoked the method
     player.PlayGame();
	}

}
 