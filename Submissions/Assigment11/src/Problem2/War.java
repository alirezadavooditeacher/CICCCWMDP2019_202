package Problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class War {
	ArrayList<Transformer> autobots = new ArrayList<Transformer>();
	ArrayList<Transformer> decepticons = new ArrayList<Transformer>();
	ArrayList<Battle> battles = new ArrayList<Battle>();

	public War(List<Transformer> Transformes) {
		// separete the list of transformes into two teams
		Transformes.stream().forEach(T -> {
			if (T.getTeam() == Transformer.Team.Autobot) {
				autobots.add(T);
			} else {
				decepticons.add(T);
			}
		});

		// sorting the the gorups by Overal Rating
		autobots.sort((t1, t2) -> t2.getOveralRating() - t1.getOveralRating());
		decepticons.sort((t1, t2) -> t2.getOveralRating() - t1.getOveralRating());
	}

	public int getNBattles() {
		int nAutobots = autobots.size();
		int nDecepticons = decepticons.size();
		return Math.min(nAutobots, nDecepticons);
	}

	public void goBattle() {

		int nBattles = getNBattles();

		for (int i = 0; i <= nBattles - 1; i++) {
			Battle battle = new Battle(autobots.get(i), decepticons.get(i));

			battle.begin();

			battles.add(battle);

		}

	}

	public void WarResults() {
		String champions;
		String looser;

		List<String> suvivors;

		int autobotsWins = 0;
		int decepticonswins = 0;

		for (Battle battle : battles) {
			Transformer winner = battle.getWinner();
			if (winner == null) {
		        if (autobotsWins == decepticonswins) {
		            System.out.format("battle Draw");
		            System.out.println();
		        }
				continue;
			}
			if (winner.getTeam() == Transformer.Team.Autobot) {
				autobotsWins++;
			} 
			else if (winner.getTeam() == Transformer.Team.Decepticon) {
				decepticonswins++;
			}
			

			if (autobotsWins > decepticonswins) {
				champions = "Autobot";
				looser = "Decepticon";
				suvivors = decepticons.stream().filter(trans -> !trans.isDefeated()).map(Transformer::getName)
						.collect(Collectors.toList());
			}

			else {
				champions = "Decepticon";
				looser = "Autobot";
				suvivors = autobots.stream().filter(trans -> !trans.isDefeated()).map(Transformer::getName)
						.collect(Collectors.toList());
			}
			
			System.out.format("%d battle, Winning team (%s) \nSurvivors from the losing team (%s): %s",
	                battles.size(),
	                champions,
	                looser,
	                suvivors
	        );
			System.out.println();
		}

	}

}
