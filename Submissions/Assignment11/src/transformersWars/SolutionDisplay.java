package transformersWars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SolutionDisplay {
	int battles;
	HashMap<String,Integer> battlesWinsDictio;
	ArrayList<String> looserSurvirvors;
	
	public SolutionDisplay() {
		super();
		this.battles=0;
		this.battlesWinsDictio= new HashMap<String,Integer>();
		this.battlesWinsDictio.put("A", 0);
		this.battlesWinsDictio.put("D", 0);
		this.looserSurvirvors = new ArrayList<String>();
	
	}
	
	public void battleCountUp () {
		this.battles++;
	}
	
	public void recordBattleResult(String AorD) {
		int currentWins = this.battlesWinsDictio.get(AorD);
		int newWins = currentWins + 1;
		this.battlesWinsDictio.put(AorD, newWins);
	}
	
	public String winnerJudge() {
		String winner = "";
		int bA = this.battlesWinsDictio.get("A");
		int bD = this.battlesWinsDictio.get("D");
		if(bA == bD) {
			winner = "TIE";
		}
		else if (bA>bD) {
			winner = "Autobots";
		} else { winner= "Decepticons";}
				
		return winner;
	}

	public ArrayList<String> getLooserSurvirvors() {
		return looserSurvirvors;
	}

	public void setLooserSurvirvors(ArrayList<String> looserSurvirvors) {
		this.looserSurvirvors = looserSurvirvors;
	}

	public int getBattles() {
		return battles;
	}

	public HashMap<String, Integer> getBattlesWinsDictio() {
		return battlesWinsDictio;
	}
	
	
	
	
}
