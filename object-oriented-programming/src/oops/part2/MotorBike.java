package oops.part2;

public class MotorBike {
	private int speed;

	public MotorBike(int speed) {
		this.speed = speed;

	}

	public MotorBike() {
		this(5);
	}

	void startBike() {
		System.out.println("Bike Started");
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increseSpeed(int howMuch) {
		if (howMuch > 0) {
			this.speed = this.speed + howMuch;
		} else {
			System.out.println("The increseSpeed " + "Should BE greater than number Zero");
		}

	}

	public void decreseSpeed(int howMuch) {
		if (howMuch > 0) {
			this.speed = this.speed - howMuch;
		} else {
			System.out.println("The decreseSpeed " + "Should BE greater than number Zero");
		}

	}

	int getSpeed() {
		return speed;
	}

}
