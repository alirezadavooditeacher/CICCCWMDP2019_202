package Problem2.Transformer;

// POJO class for all Transformers
public class Transformer {
    private Skill Strength;
    private Skill Intelligence;
    private Skill Speed;
    private Skill Endurance;
    private Skill Rank;
    private Skill Courage;
    private Skill Firepower;
    private Skill Skill;
    private String Name;
    private Team Team;
    private boolean isDestroyed;
    private int TotalRate;

    public Transformer(String name, Team team ,int strength, int intelligence, int speed, int endurance, int rank, int courage, int firepower, int skill){
        Strength     = new Skill(strength);
        Intelligence = new Skill(intelligence);
        Speed        = new Skill(speed);
        Endurance    = new Skill(endurance);
        Rank         = new Skill(rank);
        Courage      = new Skill(courage);
        Firepower    = new Skill(firepower);
        Skill        = new Skill(skill);
        Name         = name;
        Team         = team;
        isDestroyed  = false;
        TotalRate    = strength + intelligence + speed + endurance + firepower;
    }

    public Problem2.Transformer.Skill getStrength() {
        return Strength;
    }

    public Problem2.Transformer.Skill getRank() {
        return Rank;
    }

    public Problem2.Transformer.Skill getCourage() {
        return Courage;
    }

    public Problem2.Transformer.Skill getSkill() {
        return Skill;
    }

    public int getTotalRate() {
        return TotalRate;
    }

    public String getName() {
        return Name;
    }

    public Problem2.Transformer.Team getTeam() {
        return Team;
    }

    public void setRank(Problem2.Transformer.Skill rank) {
        Rank = rank;
    }

    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}
