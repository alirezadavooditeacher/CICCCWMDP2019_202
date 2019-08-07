package transformersWars;

import java.util.ArrayList;

public class AppDriver {
	
	public static void main(String[] args) {
		SolutionDisplay solution = new SolutionDisplay();
		Transformer r1 = new Transformer("auto1",5,5,5,5,5,5,5,Transformer.Faction.Autobot);
		Transformer r2 = new Transformer("auto2",5,5,5,5,5,5,5,Transformer.Faction.Autobot);
		Transformer r3 = new Transformer("auto3",5,5,5,5,5,5,5,Transformer.Faction.Autobot);
		Transformer r4 = new Transformer("auto4",5,5,5,5,5,5,5,Transformer.Faction.Deception);
		Transformer r5 = new Transformer("auto5",5,5,5,5,5,5,5,Transformer.Faction.Deception);
		
		ArrayList<Transformer> gladiators = new ArrayList<Transformer>();
		gladiators.add(r1);
		gladiators.add(r2);
		gladiators.add(r3);
		gladiators.add(r4);
		gladiators.add(r5);
		
		War w1 = new War(gladiators);
		
		w1.warEvent(solution);
		
		System.out.println("Total Battles: "+solution.getBattles());
		System.out.println("The winning team was: "+ solution.winnerJudge());
		System.out.println("The loosing team survivors were: "+ solution.getLooserSurvirvors());
		
		
	}

}
