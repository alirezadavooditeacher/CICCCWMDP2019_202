package src.problem4;

public class Table implements Countable {
    private int countOfLegs;

    public Table(int countOfLegs) {
        this.countOfLegs = countOfLegs;
    }

    public int getCountOfLegs() {
        return this.countOfLegs;
    }
}