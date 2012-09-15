
package com.tournament;

public class ByePlayer extends Player {
	public ByePlayer(String name, String handle) {
		super(name, handle);
		// TODO Auto-generated constructor stub
	}

	public ByePlayer() {
		Handle = "Player";
	}

	public boolean isByePlayer() {
		return true;
	}
}


