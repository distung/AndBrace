package com.tournament;

public class Match {
	public Player Player1;
	public Player Player2;
	public Player Winner;
	
	public int Player1Score;
	public int Player2Score;
	
	public void PlayerOneWins(Player player, int player1Score, int player2Score) {
		this.Winner = player;
		Player1Score = player1Score;
		Player2Score = player2Score;
	}
	
	public void PlayerOneTwo(Player player, int player1Score, int player2Score) {
		this.Winner = player;
		Player1Score = player1Score;
		Player2Score = player2Score;
	}
	
	public Match(Player player1,Player player2) {
		Player1 = player1;
		Player2 = player2;	
	}
	
	public Match() {
		
	}
}
