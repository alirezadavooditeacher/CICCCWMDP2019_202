package Problem02;

public class Transformer {
    public enum Team {
        Autobot,
        Deception
    }

    private String name;
    private int strength;
    private int intelligence;
    private int speed;
    private int endurance;
    private int firepower;
    private Team team;
    private boolean destroyed = false;

    public Transformer(String name, int strength, int intelligence, int speed, int endurance, int firepower, Team team) {
        this.name = name;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.endurance = endurance;
        this.firepower = firepower;
        this.team = team;
    }

    public int getRank() {
        return strength + intelligence + speed + endurance + firepower;
    }

    public boolean isSpecial() {
        if (name.equals("Optimus Prime") || name.equals("Predaking")) {
            return true;
        }
        return false;
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

    public int getFirepower() {
        return firepower;
    }

    public void setFirepower(int firepower) {
        this.firepower = firepower;
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

    @Override
    public String toString() {
        return "Transformer{" +
                "name='" + name + '\'' +
                "Team='" + team + '\'' +
                "rank='" + getRank() + '\'' +
                '}';
    }
}
