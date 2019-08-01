package Problem02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Wor {
    private ArrayList<Transformer> autobot = new ArrayList<>();
    private ArrayList<Transformer> deception = new ArrayList<>();
    private ArrayList<Battle> battles = new ArrayList<>();

    public Wor(List<Transformer> transformers) {
        // separate transformers into two teams
        for (Transformer t : transformers) {
            if (t.getTeam() == Transformer.Team.Autobot) {
                autobot.add(t);
            } else {
                deception.add(t);
            }
        }

        autobot.sort((a, b) -> b.getRank() - a.getRank());
        deception.sort((a, b) -> b.getRank() - a.getRank());
    }

    public void start() {
        while (hasNext()) {
            Battle battle = nextBattle();
            battle.start();
            battles.add(battle);
            if (battle.isTempest()) {
                break;
            }
        }
    }

    public void printResult() {
        // 1 battle Winning team (Decepticons): Soundwave Survivors from the losing team (Autobots): Hubcap
        String wonTeam = "None";
        String lostTeam = "None";
        List<String> suvirors;

        int autobotWin = 0;
        int deceptionWin = 0;
        boolean isTempest = false;
        for(Battle battle: battles) {
            Transformer winner = battle.getWinner();
            if (battle.isTempest()) {
                isTempest = true;
            }
            if (winner == null) {
                continue;
            }
            if (winner.getTeam() == Transformer.Team.Autobot) {
                autobotWin++;
            } else if (winner.getTeam() == Transformer.Team.Deception) {
                deceptionWin++;
            }
        }

        if (isTempest) {
            System.out.format("%d battle ALL DESTROYED", battles.size());
            System.out.println();
            return;
        }

        if (autobotWin == deceptionWin) {
            System.out.format("%d battle Draw", battles.size());
            System.out.println();
            return;
        }

        if (autobotWin > deceptionWin) {
            wonTeam = "Autobot";
            lostTeam = "Deception";
            suvirors = deception.stream().filter(t -> !t.isDestroyed()).map(Transformer::getName).collect(Collectors.toList());
        } else {
            wonTeam = "Deception";
            lostTeam = "Autobot";
            suvirors = autobot.stream().filter(t -> !t.isDestroyed()).map(Transformer::getName).collect(Collectors.toList());
        }

        System.out.format(
                "%d battle Winning team (%s): Soundwave Survivors from the losing team (%s): %s",
                battles.size(),
                wonTeam,
                lostTeam,
                suvirors
        );
        System.out.println();
    }

    private boolean hasNext() {
        int battlesHaveDone = battles.size();
        return autobot.size() > battlesHaveDone && deception.size() > battlesHaveDone;
    }

    private Battle nextBattle() {
        int index = battles.size();
        return new Battle(autobot.get(index), deception.get(index));
    }
}
