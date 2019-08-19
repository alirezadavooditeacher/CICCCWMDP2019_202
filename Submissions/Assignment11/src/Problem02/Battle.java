package Problem02;

import java.util.ArrayList;
import java.util.List;

public class Battle {
    private Transformer competitorA;
    private Transformer competitorB;
    private Result result;

    public Battle(Transformer competitorA, Transformer competitorB) {
        this.competitorA = competitorA;
        this.competitorB = competitorB;
    }

    public void start() {
        for (Rule rule : rules()) {
            Result result = rule.judge(competitorA, competitorB);
            if (result != null) {
                this.result = result;
                break;
            }
        }
    }

    private List<Rule> rules() {
        ArrayList<Rule> rules = new ArrayList<>();
        // Any Transformer named Optimus Prime or Predaking wins his fight automatically regardless of any other criteria
        rules.add(new Rule() {
            private boolean isSpecial(String name) {
                return name.equals("Optimus Prime") || name.equals("Predaking");
            }

            @Override
            public Result judge(Transformer a, Transformer b) {
                if (isSpecial(a.getName()) && isSpecial(b.getName())) {
                    a.setDestroyed(true);
                    b.setDestroyed(true);
                    return new Result(null, null, true);
                }
                if (isSpecial(a.getName())) {
                    b.setDestroyed(true);
                    return new Result(a, b, false);
                }
                if (isSpecial(b.getName())) {
                    a.setDestroyed(true);
                    return new Result(b, a, false);
                }

                return null;
            }
        });

        // If any fighter is down 4 or more points of courage and 3 or more points of strength  compared to their
        // opponent, the opponent automatically wins the face-off regardless of  overall rating (opponent has ran away)  
        rules.add((a, b) -> {
            if (a.getCourage() - 3 > b.getCourage() && a.getStrength() - 2 > b.getStrength()) {
                return new Result(a, b, false);
            }
            if (b.getCourage() - 3 > a.getCourage() && b.getStrength() - 2 > a.getStrength()) {
                return new Result(b, a, false);
            }

            return null;
        });

        // Otherwise, if one of the fighters is 3 or more points of skill above their opponent, they win  the fight
        // regardless of overall rating
        rules.add((a, b) -> {
            if (a.getSkill() - 2 > b.getSkill()) {
                return new Result(a, b, false);
            }
            if (b.getSkill() - 2 > a.getSkill()) {
                return new Result(b, a, false);
            }
            return null;
        });

        // The winner is the Transformer with the highest overall rating
        rules.add((a, b) -> {
            // The winner is the Transformer with the highest overall rating
            if (a.getOverallRating() > b.getOverallRating()) {
                b.setDestroyed(true);
                return new Result(a, b, false);
            }
            if (a.getOverallRating() < b.getOverallRating()) {
                a.setDestroyed(true);
                return new Result(b, a, false);
            }
            // In the event of a tie, both Transformers are considered destroyed
            a.setDestroyed(true);
            b.setDestroyed(true);
            return new Result(null, null, false);
        });

        return rules;
    }


    public Transformer getWinner() {
        return result.getWinner();
    }

    public Transformer getLooser() {
        return result.getLooser();
    }

    public boolean isTempest() {
        return result.isTempest();
    }
}
