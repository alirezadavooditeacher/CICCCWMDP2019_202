package Problem02;

public class Battle {
    private Transformer competitorA;
    private Transformer competitorB;
    private Transformer winner = null;
    private Transformer looser = null;
    private boolean tempest = false;

    public Battle(Transformer competitorA, Transformer competitorB) {
        this.competitorA = competitorA;
        this.competitorB = competitorB;
    }

    public void start() {
        if (competitorA.isSpecial() && competitorB.isSpecial()) {
            tempest = true;
            competitorA.setDestroyed(true);
            competitorB.setDestroyed(true);
        } else if (competitorA.isSpecial()) {
            win(competitorA, competitorB);
        } else if (competitorB.isSpecial()) {
            win(competitorB, competitorA);
        } else if (competitorA.getRank() > competitorB.getRank()) {
            win(competitorA, competitorB);
        } else if (competitorA.getRank() < competitorB.getRank()) {
            win(competitorB, competitorA);
        }
    }

    private void win(Transformer winner, Transformer looser) {
        looser.setDestroyed(true);
        this.winner = winner;
        this.looser = looser;
    }

    public Transformer getWinner() {
        return winner;
    }

    public Transformer getLooser() {
        return looser;
    }

    public boolean isTempest() {
        return tempest;
    }
}
