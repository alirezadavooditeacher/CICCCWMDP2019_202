package Problem2;

public class Transformer {

	private String name;
	private int strength;
	private int intelligence;
	private int speed;
	private int endurance;
	private int firepower;
	private Team team;
	private boolean defeated;
	
	public Transformer(String name, int strength, int itelligence, int speed, int endurance, int firepower, Team team) {
		super();
		this.name = name;
		this.strength = strength;
		this.intelligence = itelligence;
		this.speed = speed;
		this.endurance = endurance;
		this.firepower = firepower;
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Transformer: [name=" + name + ", team=" + team + ", rank= " +  getRank()+"]";
	}

	public enum Team{
		Autobot,
		Decption
	}
	
	public boolean isDefeated() {
		return defeated;
	}

	public void setDefeated(boolean defeated) {
		this.defeated = defeated;
	}

	
    public int getRank() {
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
	
	
	
}
