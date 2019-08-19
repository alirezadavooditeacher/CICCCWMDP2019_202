/*
Problem2:

Cornerstone | The Transformation Company

Cornerstone does love transforming... people, lives, teams, companies. And there’s no
better representation of transformation than Hasbro’s Transformers , the classic television
series featuring heroic AutobotsName raging their battle to destroy the evil forces of the
Deceptions. Please watch this video:
https://www.youtube.com/watch?v=nLS2N9mHWaw

And write the following in
whatever language you like: The Transformers are at war and you are in charge of
settling the score! You’re to evaluate who wins a fight between the AutobotsName and the
DecepticonsName. Here are the rules. Each Transformer has the following criteria on their
tech spec (see
http://www.ntfa.net/ntfa/techspecs/index.php?cat=Gen1&group=DeceptPZ&char=Predaking

for an example):

● Strength
● Intelligence
● Speed
● Endurance
● Rank
● Courage
● Firepower
● Skill
All of these criteria are ranked from 1 to 10.

The “overall rating” of a Transformer is the following formula: (Strength + Intelligence +
Speed + Endurance + Firepower)
Each Transformer must either be an TransFormer or a Deception.
Your program should take input that describes a group of Transformers and based on that
group displays:
a. The number of battles
b. The winning team
c. The surviving members of the losing team

The basic rules of the battle are:
• The teams should be sorted by rank and faced off one on one against each other in
order to determine a victor, the loser is eliminated
• A battle between opponents uses the following rules:

o If any fighter is down 4 or more points of courage and 3 or more points of
strength compared to their opponent, the opponent automatically wins the
face-off regardless of overall rating (opponent has ran away)

o Otherwise, if one of the fighters is 3 or more points of skill above their
opponent, they win the fight regardless of overall rating

o The winner is the Transformer with the highest overall rating

o In the event of a tie, both Transformers are considered destroyed

o Any Transformers who don’t have a fight are skipped (i.e. if it’s a team of 2
vs. a team of 1, there’s only going to be one battle) .The team who
eliminated the largest number of the opposing team is the winner
Special rules:

• Any Transformer named Optimus Prime or Predaking wins his fight automatically
regardless of any other criteria

• In the event either of the above face each other (or a duplicate of each other), the
game immediately ends with all competitors destroyed For example, given
the following input: Soundwave, D, 8,9,2,6,7,5,6,10 Bluestreak, A,
6,6,7,9,5,2,9,7
Hubcap: A, 4,4,4,4,4,4,4,4
The output should be:
1 battle Winning team (DecepticonsName): Soundwave Survivors from the losing team
(AutobotsName): Hubcap

 */

package src.problem2;

import java.util.ArrayList;

public class ApplicationDriver {

    public static void main(String[] args) {
        System.out.println("\ntest1");
        test01_legendBattle();
        System.out.println("\ntest2");
        test02_decepticonWin();
        System.out.println("\ntest3");
        test03_autobotWin_2decepticonLeft();
        System.out.println("\ntest4");
        test04_2battle_tie();
        System.out.println("\ntest5");
        test05_2battle_tie_with_legends();
    }

    private static void test01_legendBattle() {
        Autobot autobot01 = new Autobot(AutobotsName.OPTIMUS_PRIME, 2,3,4,5,6,7,8,9);
        Decepticon decepticon01 = new Decepticon(DecepticonsName.PREDAKING, 1,2,3,4,5,6,7,8);

        ArrayList<Autobot> autobots = new ArrayList<>();
        autobots.add(autobot01);
        ArrayList<Decepticon> decepticons = new ArrayList<>();
        decepticons.add(decepticon01);
        Judge judge = new Judge();
        judge.battle(autobots, decepticons);
    }

    private static void test02_decepticonWin() {
        Autobot autobot01 = new Autobot(AutobotsName.FASTLANE, 1, 2,3,4,5,6,7,8);
        Decepticon decepticon01 = new Decepticon(DecepticonsName.OVERKILL, 1,6,3,4,5,6,7,8);

        ArrayList<Autobot> autobots = new ArrayList<>();
        autobots.add(autobot01);
        ArrayList<Decepticon> decepticons = new ArrayList<>();
        decepticons.add(decepticon01);
        Judge judge = new Judge();
        judge.battle(autobots, decepticons);
    }

    private static void test03_autobotWin_2decepticonLeft() {
        Autobot autobot01 = new Autobot(AutobotsName.FASTLANE, 1, 6,8,9,9,6,7,8);
        Decepticon decepticon01 = new Decepticon(DecepticonsName.OVERKILL, 1,1,3,4,5,2,4,3);
        Decepticon decepticon02 = new Decepticon(DecepticonsName.POUNCE, 1,6,3,4,5,6,7,8);
        Decepticon decepticon03 = new Decepticon(DecepticonsName.FANGRY, 1,6,3,4,5,6,7,8);

        ArrayList<Autobot> autobots = new ArrayList<>();
        autobots.add(autobot01);
        ArrayList<Decepticon> decepticons = new ArrayList<>();
        decepticons.add(decepticon01);
        decepticons.add(decepticon02);
        decepticons.add(decepticon03);
        Judge judge = new Judge();
        judge.battle(autobots, decepticons);
    }

    private static void test04_2battle_tie() {
        Autobot autobot01 = new Autobot(AutobotsName.FASTLANE, 3, 7,3,7,5,5,7,8);
        Autobot autobot02 = new Autobot(AutobotsName.FASTLANE, 3, 7,3,7,5,5,7,8);
        Decepticon decepticon01 = new Decepticon(DecepticonsName.OVERKILL, 3,7,3,7,5,5,7,8);
        Decepticon decepticon02 = new Decepticon(DecepticonsName.POUNCE, 3,7,3,7,5,5,7,8);

        ArrayList<Autobot> autobots = new ArrayList<>();
        autobots.add(autobot01);
        autobots.add(autobot02);
        ArrayList<Decepticon> decepticons = new ArrayList<>();
        decepticons.add(decepticon01);
        decepticons.add(decepticon02);
        Judge judge = new Judge();
        judge.battle(autobots, decepticons);
    }

    private static void test05_2battle_tie_with_legends() {
        Autobot autobot01 = new Autobot(AutobotsName.OPTIMUS_PRIME, 3, 7,3,7,5,5,7,8);
        Autobot autobot02 = new Autobot(AutobotsName.FASTLANE, 9, 9,9,9,9,9,9,9);
        Decepticon decepticon01 = new Decepticon(DecepticonsName.OVERKILL, 9,9,9,9,9,9,9,9);
        Decepticon decepticon02 = new Decepticon(DecepticonsName.PREDAKING, 3,7,3,7,5,5,7,8);

        ArrayList<Autobot> autobots = new ArrayList<>();
        autobots.add(autobot01);
        autobots.add(autobot02);
        ArrayList<Decepticon> decepticons = new ArrayList<>();
        decepticons.add(decepticon01);
        decepticons.add(decepticon02);
        Judge judge = new Judge();
        judge.battle(autobots, decepticons);
    }
}
