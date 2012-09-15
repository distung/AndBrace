package com.tournament;

public class Player {
	String Name;
	String Handle;
	public Player() {
		
	}
	
	public  Player(String name,String handle) {
		Name = name;
		Handle = handle;
	}

	public boolean isByePlayer() {
		return false;
	}
}
