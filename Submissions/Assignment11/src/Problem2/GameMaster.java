package Problem2;

import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

import java.util.ArrayList;
import java.util.HashMap;

public class GameMaster {

    private HashMap<Team, ArrayList<Transformer>> arrangeTeams(Transformer[] transformers){
        HashMap<Team, ArrayList<Transformer>> teams = new HashMap<>();
        ArrayList<Transformer> autobots = new ArrayList<>();
        ArrayList<Transformer> decepticons = new ArrayList<>();
        for(int i = 0; i < transformers.length; i++){
            if(transformers[i].getTeam() == Team.A){
                autobots.add(transformers[i]);
            } else if(transformers[i].getTeam() == Team.D){
                decepticons.add(transformers[i]);
            }
        }
        teams.put(Team.A, autobots);
        teams.put(Team.D, decepticons);
        return teams;
    }
}
