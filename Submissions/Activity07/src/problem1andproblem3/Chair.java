package src.problem1andproblem3;

public class Chair implements Countable{
    private int countOfLegs;

    public Chair(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return this.countOfLegs;
    }
}
