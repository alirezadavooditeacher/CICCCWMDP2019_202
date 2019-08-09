package src.problem2;

public class BattleField {

    public BattleResult battle(Autobot bot1, Decepticon bot2) {

        BattleResult resultLegend = legendFight(bot1, bot2);
        if (resultLegend != BattleResult.NO_RESULT) {
            return resultLegend;
        }

        BattleResult resultCourageStrength = courageAndStrengthFight(bot1, bot2);
        if (resultCourageStrength != BattleResult.NO_RESULT) {
            return resultCourageStrength;
        }

        BattleResult resultSkill = skillFight(bot1, bot2);
        if (resultSkill != BattleResult.NO_RESULT) {
            return resultSkill;
        }

        BattleResult resultOverallRating = overallRatingFight(bot1, bot2);
        return resultOverallRating;
    }

    private BattleResult legendFight(Autobot bot1, Decepticon bot2) {
        AutobotsName bot1Name = bot1.getName();
        DecepticonsName bot2Name = bot2.getName();
        if (bot1.equals(bot2) && (bot1.equals(AutobotsName.OPTIMUS_PRIME) || bot1.equals(DecepticonsName.PREDAKING))) {
            // legend autobot battle against same legend autobot
            return BattleResult.ALL_DESTROYED;
        } else if (bot1Name.equals(AutobotsName.OPTIMUS_PRIME) && bot2Name.equals(DecepticonsName.PREDAKING) || bot1Name.equals(DecepticonsName.PREDAKING) && bot2Name.equals(AutobotsName.OPTIMUS_PRIME)) {
            // legend autobot battle against different legend autobot
            return BattleResult.ALL_DESTROYED;

        } else if (bot1Name.equals(AutobotsName.OPTIMUS_PRIME) && !bot2Name.equals(DecepticonsName.PREDAKING)) {
            // legend autobot battle against not legend autobot
            return BattleResult.WIN;

        } else if (!bot1Name.equals(AutobotsName.OPTIMUS_PRIME) && bot2Name.equals(DecepticonsName.PREDAKING)) {
            // not legend autobot battle against legend autobot
            return BattleResult.LOSE;
        }

        // not legend autobot battle against not legend autobot
        return BattleResult.NO_RESULT;
    }

    private BattleResult courageAndStrengthFight(TransFormer bot1, TransFormer bot2) {
        // A's points of courage >= B's points of courage + 4 && A's points of strength >= B's points of strength + 3, A will win
        int courage1 = bot1.getCourage();
        int courage2 = bot2.getCourage();
        int strength1 = bot1.getStrength();
        int strength2 = bot2.getStrength();

        if (courage1 >= courage2 + 4 && strength1 >= strength2 + 3) {
            return BattleResult.WIN;
        } else if (courage2 >= courage1 + 4 && strength2 >= strength1 + 3) {
            return BattleResult.LOSE;
        }

        return BattleResult.NO_RESULT;
    }

    private BattleResult skillFight(TransFormer bot1, TransFormer bot2) {
        // A's points of skill >= B's points of skill + 3 , A will win
        int skill1 = bot1.getSkill();
        int skill2 = bot2.getSkill();
        if (skill1 >= skill2 + 3) {
            return BattleResult.WIN;
        } else if (skill2 >= skill1 + 3) {
            return BattleResult.LOSE;
        }

        return BattleResult.NO_RESULT;
    }

    private BattleResult overallRatingFight(TransFormer bot1, TransFormer bot2) {
        int overall1 = bot1.getOverallRating();
        int overall2 = bot2.getOverallRating();
        if (overall1 > overall2) {
            return BattleResult.WIN;
        } else if (overall1 < overall2) {
            return BattleResult.LOSE;
        } else {
            return BattleResult.TIE;
        }
    }
}
