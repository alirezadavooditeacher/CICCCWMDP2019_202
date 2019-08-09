package src.problem2;

public class Autobot extends TransFormer {

    private String team = "Autobot";
    private AutobotsName name;

    public Autobot(AutobotsName name, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        super(strength, intelligence, speed, endurance, rank, courage, firepower, skill);
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public AutobotsName getName() {
        return name;
    }

    public void setName(AutobotsName name) {
        this.name = name;
    }
}
