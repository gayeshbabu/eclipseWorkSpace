package oops.part2;

public class Bycle {
	
	protected int gear;
	protected int speed;
	
	public Bycle(int gear, int speed) {
		this.speed=speed;
		this.gear=gear;
		
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void changeGear(int newValue) {
	          gear=gear+ newValue;
	}
	public void applyBreak(int decreseSpeed) {
		speed=speed-decreseSpeed;
		
	}
	
	public void increseSpeed(int increment) {
		speed=speed+increment;
	}
	
	

}
