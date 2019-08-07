package transformersWars;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

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
		autobot.sort((t1,t2)-> t2.getRank()-t1.getRank());
		decepticon.sort((t1,t2)-> t2.getRank()-t1.getRank());
	}
	BiFunction<Transformer, Transformer, String> brule1 = (ta, td) ->{
		String r1Winner = null;
		int cDiff = ta.getCourage() - td.getCourage(); 
		int sDiff = ta.getStrength() - td.getStrength();
		if(cDiff >= 4 && sDiff >= 3 ) {
			r1Winner="A";	
		}
		else if (cDiff <= -4 && sDiff <=-3) {
			r1Winner = "D";
		}
		return r1Winner;
	};
	BiFunction<Transformer, Transformer, String> brule2 = (ta, td) ->{
		String r2Winner = null;
		int skDiff = ta.getSkill() - td.getSkill();
		if(skDiff >=3) {
			r2Winner="A";
		}
		else if(skDiff <=-3) {
			r2Winner="D";
		}
		return r2Winner;
	};
	
	
	
	BiConsumer<SolutionDisplay,Transformer> bForA = (sol, td) -> {
		sol.battleCountUp();
		sol.recordBattleResult("A");
		td.setDestroyed(true);
	};
	
	BiConsumer<SolutionDisplay, Transformer> bForD =(sol, ta) ->{
		sol.battleCountUp();
		sol.recordBattleResult("D");
		ta.setDestroyed(true);
	};
	
	Consumer<SolutionDisplay> survivorsProvider = (sol) -> {
		String warWinner = sol.winnerJudge();
		ArrayList<String> lSurvive = new ArrayList<>();
		if (warWinner == "TIE") {
			lSurvive.add("No looser team");
		}
		else if (warWinner == "Autobots") {
			
			for(Transformer tr : decepticon) {
				if(!(tr.isDestroyed())){
					lSurvive.add(tr.getName());
				}
			}
		}
		else {
			for(Transformer tr : autobot) {
				if(!(tr.isDestroyed())){
					lSurvive.add(tr.getName());
				}
			}
		}
		sol.setLooserSurvirvors(lSurvive);
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
			bForA.accept(sol, td);
		}
		else if(td.getName() == "Predaking") {
			bForD.accept(sol, ta);
		}
		else if(null != brule1.apply(ta , td) ) {
			String r1Winner = brule1.apply(ta, td);
			if(r1Winner == "A") {
				bForA.accept(sol, td);
			}
			else if (r1Winner == "D") {
				bForD.accept(sol, ta);
			}	
		}
		else if(null != brule2.apply(ta , td) ) {
			String r2Winner = brule2.apply(ta, td);
			if(r2Winner == "A") {
				bForA.accept(sol, td);
			}
			else if (r2Winner == "D") {
				bForD.accept(sol, ta);
			}	
		}
		else if(ta.getRank() == td.getRank()) {
			sol.battleCountUp();
			ta.setDestroyed(true);
			td.setDestroyed(true);
		}
		else if(ta.getRank() > td.getRank()) {
			bForA.accept(sol, td);
		}else {
			bForD.accept(sol, ta);
		}
		
	};
	
	public void warEvent(SolutionDisplay sol) {
		while (pendingBattles(sol) && !(this.isTheEnd)) {
			int index = sol.getBattles();
			battle.accept(sol, this.autobot.get(index), this.decepticon.get(index));
		}
		survivorsProvider.accept(sol);
	}

	private boolean pendingBattles(SolutionDisplay ssol) {
		// TODO Auto-generated method stub
		int index = ssol.getBattles();
		return autobot.size() > index && decepticon.size() > index;
	}

	public ArrayList<Transformer> getAutobot() {
		return autobot;
	}

	public ArrayList<Transformer> getDecepticon() {
		return decepticon;
	}
	
	
	
}
