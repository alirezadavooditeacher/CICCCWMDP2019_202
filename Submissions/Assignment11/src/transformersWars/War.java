package transformersWars;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class War {
	ArrayList<Transformer> autobot = new ArrayList<Transformer>();
	ArrayList<Transformer> decepticon = new ArrayList<Transformer>();
	public boolean isTheEnd = false; 
	
	public War (ArrayList<Transformer> transformers) {
		for (Transformer tr : transformers) {
			if( tr.getFaction() == Transformer.Faction.Autobot) {
				autobot.add(tr);
			}else {
				decepticon.add(tr);
			}
		}
		autobot.sort((t1,t2)-> t1.getRank()-t2.getRank());
		decepticon.sort((t1,t2)-> t1.getRank()-t2.getRank());
	}
	BiFunction<Transformer, Transformer, String> brule1 = (ta, td) ->{
		String r1Winner = null;
		
		return r1Winner;
	};
	MyBiConsumer<SolutionDisplay,Transformer> battle = (sol,ta,td) -> {
		if (ta.getName() == "Optimus Prime" && td.getName() == "Predaking") {
			for (Transformer tr : autobot) {
				tr.setDestroyed(true);
			}
			for (Transformer tr : decepticon) {
				tr.setDestroyed(true);
			}
			this.isTheEnd = true;
		}
		else if(ta.getName() == "Optimus Prime") {
			sol.battleCountUp();
			sol.recordBattleResult("A");
			td.setDestroyed(true);
		}
		else if(td.getName() == "Predaking") {
			sol.battleCountUp();
			sol.recordBattleResult("D");
			ta.setDestroyed(true);
		}
		else if(null != brule1.apply(ta , td) ) {
			
		}
		
	};
	
	public void warEvent(SolutionDisplay sol) {
		while (pendingBattles(sol)) {
			
		}
	}

	private boolean pendingBattles(SolutionDisplay ssol) {
		// TODO Auto-generated method stub
		int index = ssol.getBattles();
		return autobot.size() > index && decepticon.size() > index;
	}
	
}
