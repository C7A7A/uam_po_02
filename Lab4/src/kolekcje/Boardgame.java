package kolekcje;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Boardgame {

	public String name;
    public double rating;
    public float price;
    public int minPlayers;
    public int maxPlayers;

    public Boardgame(String name, double rating, float price, int minPlayers, int maxPlayers) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
    }
	
	public static void main(String[] args) {
		List<Boardgame> games = Arrays.asList(
		    new Boardgame("Terraforming Mars", 8.38, (float) 123.49, 1, 5),
		    new Boardgame("Codenames", 7.82, (float) 64.95, 2, 8),
		    new Boardgame("Puerto Rico", 8.07, (float) 149.99, 2, 5),
		    new Boardgame("Terra Mystica", 8.26, (float) 252.99, 2, 5),
		    new Boardgame("Scythe", 8.3, (float) 314.95, 1, 5),
		    new Boardgame("Power Grid", 7.92, (float) 145, 2, 6),
		    new Boardgame("7 Wonders Duel", 8.15, (float) 109.95, 2, 2),
		    new Boardgame("Dominion: Intrigue", 7.77, (float) 159.95, 2, 4),
		    new Boardgame("Patchwork", 7.77, (float) 75, 2, 2),
		    new Boardgame("The Castles of Burgundy", 8.12, (float) 129.95, 2, 4)
		);

//		games.stream()
//	    .filter(g -> g.maxPlayers > 4)
//	    .filter(g -> g.rating > 8)
//	    .filter(g -> g.price > 0)
//	    .map(g -> g.name.toUpperCase())
//	    .forEach(System.out::println);
		
		double highestRanking = 0;
		
		Boardgame bestGame = games
			.stream()
			.filter(g -> g.name.contains("a"))
			.max(Comparator.comparingDouble(g -> g.rating)).get();
		
		System.out.println(bestGame.name);
	}

}
