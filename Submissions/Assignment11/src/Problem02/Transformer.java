package Problem02;

public class Transformer {
    public enum Team {
        Autobot,
        Deception
    }

    private Team team;
    private boolean destroyed = false;
    private String name;
    private int strength;
    private int intelligence;
    private int speed;
    private int endurance;
    private int rank;
    private int courage;
    private int firepower;
    private int skill;

    public static Transformer createWithParams() {
        return new Transformer();
    }

    public Transformer(Team team, String name, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        this.team = team;
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.rank = rank;
        this.courage = courage;
        this.firepower = firepower;
        this.skill = skill;
    }

    public Transformer() {
    }

    public int getOverallRating() {
        return strength + intelligence + speed + endurance + firepower;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getFirepower() {
        return firepower;
    }

    public void setFirepower(int firepower) {
        this.firepower = firepower;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Transformer{" +
                "name='" + name + '\'' +
                "Team='" + team + '\'' +
                "rank='" + getRank() + '\'' +
                '}';
    }
}
