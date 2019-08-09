package Problem02;

public class Result {
    private Transformer winner = null;
    private Transformer looser = null;
    private boolean tempest = false;

//    public Result(Transformer winner, Transformer looser) {
//        Result(winner, looser, false);
//    }

    public Result(Transformer winner, Transformer looser, boolean tempest) {
        this.winner = winner;
        this.looser = looser;
        this.tempest = tempest;
    }

    public Transformer getWinner() {
        return winner;
    }

    public void setWinner(Transformer winner) {
        this.winner = winner;
    }

    public Transformer getLooser() {
        return looser;
    }

    public void setLooser(Transformer looser) {
        this.looser = looser;
    }

    public boolean isTempest() {
        return tempest;
    }

    public void setTempest(boolean tempest) {
        this.tempest = tempest;
    }
}
