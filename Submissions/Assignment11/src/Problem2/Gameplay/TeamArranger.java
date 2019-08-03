package Problem2.Gameplay;

import Problem2.Transformer.Skill;
import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

import java.util.ArrayList;
import java.util.HashMap;

public class TeamArranger {

    public static HashMap<Team, ArrayList<Transformer>> arrangeIntoTeams(Transformer[] transformers){
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

    public static void arrangeByRanks(ArrayList<Transformer> transformers){
        for(int i = 0; i < transformers.size() - 1; i ++){
            for(int j = 0; j < transformers.size() - i - 1; j ++){
                if(transformers.get(i).getRank().getRange() > transformers.get(i + 1).getRank().getRange()){
                    Skill temp = transformers.get(i).getRank();
                    transformers.get(i).setRank(transformers.get(i + 1).getRank());
                    transformers.get(i + 1).setRank(temp);
                }
            }
        }
    }
}
