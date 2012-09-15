package com.tournament;

public class Player {
	String FirstName;
	String LastName;
	String Handle;
	public Player() {
		
	}
	
	public  Player(String firstName, String lastName, String handle) {
		FirstName = firstName;
		LastName = lastName;
		Handle = handle;
	}
	
	public boolean isByePlayer() {
		return false;
	}
}
