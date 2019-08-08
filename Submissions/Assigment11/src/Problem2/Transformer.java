package Problem2;

public class Transformer {
	// ● Strength ● Intelligence ● Speed  ● Endurance ● Rank ● Courage ● Firepower ● Skill
	private Team team;
	private String name;
	private int strength;
	private int intelligence;
	private int speed;
	private int courage;
	private int endurance;
	private int rank;
	private int firepower;
	private int skill;
	private boolean defeated = false;
	
	public enum Team{
		Autobot,
		Decepticon
	}
	
	public Transformer(String name, int strength, int itelligence, int speed, int endurance, int rank, int courage, int firepower, int skill, Team team) {
		super();
		this.name = name;
		this.strength = strength;
		this.intelligence = itelligence;
		this.speed = speed;
		this.endurance = endurance;
		this.rank =rank;
		this.courage = courage;
		this.firepower = firepower;
		this.skill = skill;
		this.team = team;
	}
	
    public boolean isSpecial() {
        if (name.equals("Optimus Prime") || name.equals("Predaking")) {
            return true;
        }
        return false;
    }
	
	@Override
	public String toString() {
		return "Transformer: [name=" + name + ", team=" + team + ", rank= " +  getOveralRating()+"]";
	}

	public boolean isDefeated() {
		return defeated;
	}

	public void setDefeated() {
		this.defeated = true;
	}

	
    public int getOveralRating() {
        return strength + intelligence + speed + endurance + firepower;
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


	public void setStrenght(int stenght) {
		this.strength = stenght;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int itelligence) {
		this.intelligence = itelligence;
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

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	
}
