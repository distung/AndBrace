package com.tournament;

public class ByePlayer extends Player {
	public ByePlayer(String firstName, String lastName, String handle) {
		super(firstName, lastName, handle);
		// TODO Auto-generated constructor stub
	}

	public boolean isByePlayer() {
		return true;
	}
}
