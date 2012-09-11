package com.tournament;

public class Player {
	
	private String name;
	
	public Player(String name)
	{
		this.name = name;
	}
	
	public boolean isByePlayer() {
		return false;
	}
}
