package Problem2;

import java.util.ArrayList;


public class AppDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transformer t1 = new Transformer("Optimus Prime", 10, 10, 10, 10, 10, 10, 10, 10, Transformer.Team.Autobot);
		Transformer t2 = new Transformer("Predaking", 10, 5, 10, 8, 7, 9, 9 ,8 ,Transformer.Team.Decepticon );
		Transformer t3 = new Transformer("Soundwave", 8,9,2,6,7,5,6,10,Transformer.Team.Decepticon);
		Transformer t4 = new Transformer( "Bluestreak", 6,6,7,9,5,2,9,7, Transformer.Team.Autobot );
		Transformer t5 = new Transformer("Hubcap", 4,4,4,4,4,4,4,4,Transformer.Team.Autobot);
		
		ArrayList<Transformer> Transformes = new ArrayList<Transformer>();
		Transformes.add(t1);
		//Transformes.add(t2);
		Transformes.add(t3);
		Transformes.add(t4);
		Transformes.add(t5);
		
		War war = new War(Transformes);
		
		war.goBattle();
		
		war.WarResults();
		
	}

}
