package com.tournament;
import java.util.*;

public class BracketTournament {
	
	private HashMap<Integer, Match> bracket = new HashMap<Integer, Match>();
	private ArrayList<Player> players;
	private ISeedingStrategy strategy;
	private int numberOfMatches;
	private int numberOfLevels;
	
	public BracketTournament(ArrayList<Player> players, ISeedingStrategy strategy)
	{
		this.bracket = new HashMap<Integer, Match>();
		this.strategy = strategy;	
		this.players = this.strategy.Seed(players);
	}
	
	protected void InitializeBrackets(ArrayList<Player> players) {		
		numberOfLevels = (int) (Math.log(players.size()) / Math.log(2));
		int numberOfMatches = 2 ^ numberOfLevels;
		int positonToInsertPlayers = 2 ^ (numberOfLevels - 1);
		int positionToStop = positonToInsertPlayers + players.size();
		
		//insert players at the bottom of the bracket
		for (int i = positonToInsertPlayers; i < positionToStop; i = i+2) {
			Match match = new Match();
			match.Player1 = players.get(i);
			match.Player2 = players.get(i + 1);
			bracket.put(i, match);		
		}
		
		//the top levels of the bracket
		for (int i = 0; i < positonToInsertPlayers; i++) {
			Match match = new Match();
			bracket.put(i, match);
		}
	}
	
	public ArrayList<Match> GetAllMatchesOfLevel(int level) {
		assert level <= this.numberOfLevels;
		ArrayList<Match> matchesInLevel = new ArrayList<Match>();
		int startingNumber = 2 ^ level ;
		int endingNumber = 2 ^ level + 1;
		
		for (int i = startingNumber; i < endingNumber; i++)
		{
			matchesInLevel.add(bracket.get(i));
		}
		return matchesInLevel;
	}
	
	public ArrayList<Player> GetAllPlayersOfLevel(int level) {
		assert level <= this.numberOfLevels;
		
		ArrayList<Player> playersInLevel = new ArrayList<Player>();
		ArrayList<Match> matchesInLevel = GetAllMatchesOfLevel(level);
		for (Match match: matchesInLevel) {
			if (match.Player1 != null) {
				playersInLevel.add(match.Player1);
			}
		
			if (match.Player2 != null) {
				playersInLevel.add(match.Player1);
			}
		}
		return playersInLevel;
	}
}

