package src.problem2;

import java.util.ArrayList;

public class Judge {

    public void battle(ArrayList<Autobot> autobots, ArrayList<Decepticon> decepticons) {
        int autobotsNumber = autobots.size();
        int decepticonsNumber = decepticons.size();
        int length = autobotsNumber <= decepticonsNumber ? autobotsNumber : decepticonsNumber;

        int totalBattleNumber = 0;
        int autobotWinCount = 0;
        int decepticonWinCount = 0;
        boolean allDestroyed = false;

        BattleField battleField = new BattleField();
        for (int i = 0; i < length; i++) {

            Autobot autobot = autobots.get(i);
            Decepticon decepticon = decepticons.get(i);
            BattleResult result = battleField.battle(autobot, decepticon);
            totalBattleNumber++;
            if (result == BattleResult.WIN) {
                autobotWinCount++;
            } else if (result == BattleResult.LOSE) {
                decepticonWinCount++;
            } else if (result == BattleResult.TIE) {
                continue;
            } else if (result == BattleResult.ALL_DESTROYED) {
                allDestroyed = true;
                break;
            }
        }

        if (allDestroyed) {
            System.out.println("All transformer are destroyed because of the legend battle.");
        } else if (autobotWinCount > decepticonWinCount) {
            System.out.println(String.format("%s battle Winning team (Autobot): Survivors from the losing team (Decepticon): ", totalBattleNumber));
            if (totalBattleNumber == decepticons.size()) {
                System.out.println("none");
            } else {
                // print the rest of decepticons
                for (int i = 0; i < decepticons.size() - totalBattleNumber; i++) {
                    System.out.println(decepticons.get(i + totalBattleNumber).getName());
                }
            }
        } else if (autobotWinCount < decepticonWinCount) {
            System.out.print(String.format("%s battle Winning team (Decepticon): Survivors from the losing team (Autobot): ", totalBattleNumber));
            if (totalBattleNumber == autobots.size()) {
                System.out.println("none");
            } else {
                // print the rest of autobots
                for (int i = 0; i < autobots.size() - totalBattleNumber; i++) {
                    System.out.println(autobots.get(i + totalBattleNumber).getName());
                }
            }

        } else {
            System.out.println("The battle was tie.");
        }
    }

}
