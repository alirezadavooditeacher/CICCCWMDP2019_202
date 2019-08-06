package transformersWars;

public class Transformer {
	public  enum Faction {
		Autobot, Deception
	}
	
	String name;
	int Courage;
	int Endurance;
	int Firepower;
	int Intelligence;
	int Skill;
	int Speed;
	int Strength;
	int Rank;
	boolean destroyed = false;
	Faction faction;
	public Transformer(String name, int courage, int endurance, int firepower, int intelligence, int skill, int speed,
			int strength, transformersWars.Transformer.Faction faction) {
		super();
		this.name = name;
		Courage = courage;
		Endurance = endurance;
		Firepower = firepower;
		Intelligence = intelligence;
		Skill = skill;
		Speed = speed;
		Strength = strength;
		this.faction = faction;
		this.Rank = Strength + Intelligence + Speed + Endurance + Firepower;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourage() {
		return Courage;
	}
	public void setCourage(int courage) {
		Courage = courage;
	}
	public int getEndurance() {
		return Endurance;
	}
	public void setEndurance(int endurance) {
		Endurance = endurance;
	}
	public int getFirepower() {
		return Firepower;
	}
	public void setFirepower(int firepower) {
		Firepower = firepower;
	}
	public int getIntelligence() {
		return Intelligence;
	}
	public void setIntelligence(int intelligence) {
		Intelligence = intelligence;
	}
	public int getSkill() {
		return Skill;
	}
	public void setSkill(int skill) {
		Skill = skill;
	}
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public int getStrength() {
		return Strength;
	}
	public void setStrength(int strength) {
		Strength = strength;
	}
	public int getRank() {
		return Rank;
	}
	public void setRank(int rank) {
		Rank = rank;
	}
	public boolean isDestroyed() {
		return destroyed;
	}
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}
	public Faction getFaction() {
		return faction;
	}
	public void setFaction(Faction faction) {
		this.faction = faction;
	}
	
	public String toString() {
		return this.name;
	}
	

}
