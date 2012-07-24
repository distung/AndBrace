package com.tournament;
import java.util.*;

public interface ISeedingStrategy {
	LinkedList<Player> Seed(LinkedList<Player> players);
}
