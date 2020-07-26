package com.nt.test;

import com.nt.comp.Player;
import com.nt.factory.PlayerFactory;

public class StrategyDPProblemTest {

	public static void main(String[] args) {
     Player player=null;
     //get player
     player=PlayerFactory.getInstance();
     //invoked the method
     player.PlayGame();
	}

}
