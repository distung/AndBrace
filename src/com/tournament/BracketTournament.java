package com.tournament;
import java.util.*;

public class BracketTournament {
	
	private HashMap<Integer, Match> bracket = new HashMap<Integer, Match>();
	private LinkedList<Player> players;
	private ISeedingStrategy strategy;
	private int numberOfMatches;
	private int numberOfLevels;
	
	public BracketTournament(LinkedList<Player> players, ISeedingStrategy strategy)
	{
		this.bracket = new HashMap<Integer, Match>();
		this.strategy = strategy;	
		this.players = this.strategy.Seed(players);
	}
	
	protected void InitializeBrackets(LinkedList<Player> players) {		
		numberOfLevels = (int) (Math.log(players.size()) / Math.log(2));
		int numberOfMatches = 2 ^ numberOfLevels;
		for (int i = 1; i < players.size(); i = i+2) {
			Match match = new Match();
			match.Player1 = players.get(i);
			match.Player2 = players.get(i + 1);
			bracket.put(i, match);		
		}
		
		int restOfMatches = players.size() + 1;
		for (int i = restOfMatches; i <= numberOfMatches; i++) {
			Match match = new Match();
			bracket.put(i, match);
		}
	}
	
	public LinkedList<Match> GetAllMatchesOfLevel(int level) {
		assert level <= this.numberOfLevels;
		LinkedList<Match> matchesInLevel = new LinkedList<Match>();
		int startingNumber = 2 ^ level ;
		int endingNumber = 2 ^ level + 1;
		
		for (int i = startingNumber; i < endingNumber; i++)
		{
			matchesInLevel.add(bracket.get(i));
		}
		return matchesInLevel;
	}
	
	public LinkedList<Player> GetAllPlayersOfLevel(int level) {
		assert level <= this.numberOfLevels;
		
		LinkedList<Player> playersInLevel = new LinkedList<Player>();
		LinkedList<Match> matchesInLevel = GetAllMatchesOfLevel(level);
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
