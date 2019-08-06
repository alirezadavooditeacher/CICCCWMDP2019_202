package transformersWars;

public class AppDriver {
	
	public static void main(String[] args) {
		SolutionDisplay solution = new SolutionDisplay();
		
		
		
		System.out.println("Total Battles: "+solution.getBattles());
		System.out.println("The winning team was: "+ solution.winnerJudge());
		System.out.println("The loosing team survivors were: "+ solution.getLooserSurvirvors());
		
		
	}

}
