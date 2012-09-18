package com.tournament;

import com.db4o.ObjectSet;

import android.content.Context;

public class BracketTournamentProvider  extends DbProvider<BracketTournament> {
	public BracketTournamentProvider( Context ctx ) {
		super( BracketTournament.class, ctx );
		
		}
	
	public BracketTournament getByName(String string) {
		BracketTournament t = new BracketTournament();
		t.Name = string;
		ObjectSet<BracketTournament> set = db().queryByExample(t);
		return set.get(0);
		
	}
}
