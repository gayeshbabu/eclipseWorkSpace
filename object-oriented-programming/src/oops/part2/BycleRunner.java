package oops.part2;

public class BycleRunner {

	public static void main(String[] args) {
		Bycle bycle = new Bycle(10,20);
		System.out.println(bycle);
		
		Bycle bycle1 = new MountainBike(20,20,1);
		System.out.println(bycle1);		
	}

}
