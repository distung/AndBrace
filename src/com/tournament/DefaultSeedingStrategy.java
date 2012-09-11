package com.tournament;

import java.util.ArrayList;
import java.util.Collections;

public class DefaultSeedingStrategy implements ISeedingStrategy {

	@Override
	public ArrayList<Player> Seed(ArrayList<Player> players) {
		int tournamentSize = (int) Math.pow(2, Math.ceil((Math.log(players.size()) / Math.log(2))));
		int numByes = tournamentSize - players.size();
		for (int i = 0; i < numByes; i++) {
			ByePlayer bye = new ByePlayer("Bye");
			players.add(bye);
		}
		Collections.shuffle(players);
		return players;
	}

}
