package src.problem2;

public class TransFormer {
    private int strength;
    private int intelligence;
    private int speed;
    private int endurance;
    private int rank;
    private int courage;
    private int firepower;
    private int skill;

    public TransFormer(int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        setStrength(strength);
        setIntelligence(intelligence);
        setSpeed(speed);
        setEndurance(endurance);
        setRank(rank);
        setCourage(courage);
        setFirepower(firepower);
        setSkill(skill);
    }

    /**
     * @param expectFrom
     * @param expectTo
     * @param actual
     * @throws IllegalArgumentException
     */
    private void throwExceptionIfValueIsOutOfRange(int expectFrom, int expectTo, int actual) {
        if (actual < expectFrom || expectTo < actual) {
            throw new IllegalArgumentException();
        }
    }

    private void checkRangeOfValue(int value) {
        throwExceptionIfValueIsOutOfRange(1, 10, value);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        checkRangeOfValue(strength);
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        checkRangeOfValue(intelligence);
        this.intelligence = intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        checkRangeOfValue(speed);
        this.speed = speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        checkRangeOfValue(endurance);
        this.endurance = endurance;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        checkRangeOfValue(rank);
        this.rank = rank;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        checkRangeOfValue(courage);
        this.courage = courage;
    }

    public int getFirepower() {
        return firepower;
    }

    public void setFirepower(int firepower) {
        checkRangeOfValue(firepower);
        this.firepower = firepower;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        checkRangeOfValue(skill);
        this.skill = skill;
    }

    public int getOverallRating() {
        return getStrength() + getIntelligence() + getSpeed() + getEndurance() + getFirepower();
    }
}
