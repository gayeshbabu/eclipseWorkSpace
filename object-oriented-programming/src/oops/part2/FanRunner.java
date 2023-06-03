package oops.part2;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("mafracturer", 0.9, "green");

		
		fan.switchOn();
	    fan.setSpeed((byte) 5);
		System.out.println(fan + " when the fan is switchOn");
		
		
		fan.switchOff();
		fan.setSpeed((byte) 0);
		System.out.println(fan + " when the fan i");

	}

}
