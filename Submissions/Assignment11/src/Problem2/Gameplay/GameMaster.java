package Problem2.Gameplay;

import Problem2.Transformer.Team;
import Problem2.Transformer.Transformer;

import java.util.ArrayList;
import java.util.HashMap;

public class GameMaster {
    private Result result;
    private HashMap<Team, ArrayList<Transformer>> teams;

    public GameMaster(Transformer[] transformers){
        this.teams = TeamArranger.arrangeIntoTeams(transformers);
        TeamArranger.arrangeByRanks(teams.get(Team.A));
        TeamArranger.arrangeByRanks(teams.get(Team.D));
        this.result = new Result();
        result.calculateBattleNum(this.teams);
    }

    public void conductBattles(){
        ArrayList<Transformer> autobots = teams.get(Team.A);
        ArrayList<Transformer> decepticons = teams.get(Team.D);
        for(int i = 0; i < result.getBattleNum(); i++){
            Battle battle = new Battle(autobots.get(i), decepticons.get(i));
            battle.fight();
        }
        this.conductScoring();
        this.findSurvivors();
        this.displayGameEnd();
    }

    private void conductScoring(){
        ArrayList<Transformer> autobots = teams.get(Team.A);
        int autobotLosses = 0;
        ArrayList<Transformer> decepticons = teams.get(Team.D);
        int decepticonLosses = 0;
        for (int i = 0; i < result.getBattleNum(); i++){
            if(autobots.get(i).isDestroyed()){
                autobotLosses ++;
            }
            if(decepticons.get(i).isDestroyed()){
                decepticonLosses ++;
            }
        }
        if(decepticonLosses > autobotLosses){
            result.setWinner(Team.A);
            result.setLoser(Team.D);
        } else if(autobotLosses > decepticonLosses){
            result.setWinner(Team.D);
            result.setLoser(Team.A);
        } else {
            result.setWinner(null);
            result.setLoser(null);
        }
    }

    private void findSurvivors(){
        ArrayList<Transformer> losingTeam = teams.get(result.getLoser());
        ArrayList<Transformer> survivors = new ArrayList<>();
        losingTeam.forEach(transformer -> {
            if(!(transformer.isDestroyed())){
                survivors.add(transformer);
            }
        });
        result.setSurvivors(survivors);
    }

    private void displayGameEnd(){
        System.out.println("The winning team is: " + result.getWinner());
        System.out.println("Number of battles fought is: " + result.getBattleNum());
        System.out.println("Survivors from the losing team: ");
        result.getSurvivors().forEach(survivor -> {
            System.out.println(survivor.getName());
        });
    }

    class Result {
        private int battleNum;
        private Team winner;
        private Team loser;
        private ArrayList<Transformer> survivors;

        public Team getLoser() {
            return loser;
        }

        public void setLoser(Team loser) {
            this.loser = loser;
        }

        public int getBattleNum() {
            return battleNum;
        }

        public void setBattleNum(int battleNum) {
            this.battleNum = battleNum;
        }

        public Team getWinner() {
            return winner;
        }

        public void setWinner(Team winner) {
            this.winner = winner;
        }

        public ArrayList<Transformer> getSurvivors() {
            return survivors;
        }

        public void setSurvivors(ArrayList<Transformer> survivors) {
            this.survivors = survivors;
        }

        public void calculateBattleNum(HashMap<Team, ArrayList<Transformer>> teams){
            int autobotNum = teams.get(Team.A).size();
            int decepticonNum = teams.get(Team.D).size();
            if(autobotNum > decepticonNum){
                this.setBattleNum(decepticonNum);
            } else {
                this.setBattleNum(autobotNum);
            }
        }
    }
}
