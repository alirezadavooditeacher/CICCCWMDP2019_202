package boundedype;

public class Computer implements Comparable<Computer>{

	private int speed;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Computer(int speed) {
		super();
		this.speed = speed;
	}

	@Override
	public int compareTo(Computer o) {
		// TODO Auto-generated method stub
		return this.speed-o.getSpeed();
	}

}
