package transformersWars;

import java.util.ArrayList;

public class War {
	ArrayList<Transformer> autobot = new ArrayList<Transformer>();
	ArrayList<Transformer> decepticon = new ArrayList<Transformer>();
	
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
	
	
}
