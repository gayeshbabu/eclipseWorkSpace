package oops.part2;

public class Fan {

//	state
	private String make;
	private double radius;
	private String colour;

	private boolean isOn;
	private byte speed; // 0 to 5

// reation

	Fan(String make, double radius, String colour) {
		this.make = make;
		this.radius = radius;
		this.colour = colour;

	}

//	print state of fan
	
	public void switchOn() {
		this.isOn = true;
		setSpeed((byte)5);

	}
	public void setSpeed(byte speed) {
		this.speed = speed;

	}

	public void switchOff() {
		this.isOn = false;
		this.speed = ((byte)0);
	}
	public String toString() {
		return String.format("make -%s , radius -%f,colur -%s ,isOn -%b , speed -%d", make, radius, colour, isOn,
				speed);
	}

}
