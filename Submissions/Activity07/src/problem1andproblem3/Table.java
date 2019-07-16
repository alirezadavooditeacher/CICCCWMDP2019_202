package src.problem1andproblem3;

public class Table implements Countable {
    private int countOfLegs;
    private String marerial;
    private String color;

    public Table(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return this.countOfLegs;
    }
}
