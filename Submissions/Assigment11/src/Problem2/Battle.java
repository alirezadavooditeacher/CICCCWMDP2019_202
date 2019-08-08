package Problem2;

public class Battle {

	private Transformer fighter1;
	private Transformer fighter2;
	private Transformer winner = null;
	private Transformer looser = null;

	public Battle(Transformer fighter1, Transformer fighter2) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
	}

	public Transformer getLooser() {
		return looser;
	}

	public void setLooser(Transformer looser) {
		looser.setDefeated();
		this.looser = looser;
	}

	public Transformer getWinner() {
		return winner;
	}

	public void setWinner(Transformer winner) {
		this.winner = winner;
	}

	public void begin() {
		if (fighter1.isSpecial() && fighter2.isSpecial()) {
			fighter1.setDefeated();
			fighter2.setDefeated();

			// special rules
		} else if (fighter1.isSpecial()) {
			setWinner(fighter1);
			setLooser(fighter2);
		} else if (fighter2.isSpecial()) {
			setWinner(fighter2);
			setLooser(fighter1);
		} else if (fighter1.isSpecial()) {
			setWinner(fighter1);
			setLooser(fighter2);
		}

		// rules of 4 points corrage and 3 points of streght
		else if (((fighter1.getCourage() - fighter2.getCourage()) >= 4)
				& ((fighter1.getStrength() - fighter2.getStrength()) >= 3)) {
			setWinner(fighter1);
			setLooser(fighter2);
		} else if (((fighter1.getCourage() - fighter2.getCourage()) <= -4)
				& ((fighter1.getStrength() - fighter2.getStrength()) <= -3)) {
			setWinner(fighter2);
			setLooser(fighter1);
		}

		// skills points bigger or smaller than 3
		else if (((fighter1.getSkill() - fighter2.getSkill()) >= 3)) {
			setWinner(fighter1);
			setLooser(fighter2);
		} else if (((fighter1.getSkill() - fighter2.getSkill()) <= -3)) {
			setWinner(fighter2);
			setLooser(fighter1);
		}

		// overall rating
		else if (fighter1.getOveralRating() > fighter2.getOveralRating()) {
			setWinner(fighter1);
			setLooser(fighter2);
		} else if (fighter1.getOveralRating() < fighter2.getOveralRating()) {
			setWinner(fighter2);
			setLooser(fighter1);
		}
		else if (fighter1.getOveralRating() == fighter2.getOveralRating()) {
			setLooser(fighter1);;
			setLooser(fighter2);
		}

	}

}
