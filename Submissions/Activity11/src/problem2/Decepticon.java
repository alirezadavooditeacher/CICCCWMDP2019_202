package src.problem2;

public class Decepticon extends TransFormer {

    private String team = "Decepticon";
    private DecepticonsName name;

    public Decepticon(DecepticonsName name, int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill) {
        super(strength, intelligence, speed, endurance, rank, courage, firepower, skill);
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public DecepticonsName getName() {
        return name;
    }

    public void setName(DecepticonsName name) {
        this.name = name;
    }
}
