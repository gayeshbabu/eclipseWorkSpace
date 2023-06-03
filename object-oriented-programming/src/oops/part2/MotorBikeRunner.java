package oops.part2;
public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(100);
		MotorBike hero = new MotorBike();

		ducati.startBike();
		honda.startBike();

		//ducati.setSpeed(10);
		//honda.setSpeed(10);
		
		ducati.increseSpeed(100);
		honda.increseSpeed(100);
		
		ducati.decreseSpeed(50);
		honda.decreseSpeed(50);
		
		/*int ducatiSpeed = ducati.getSpeed();//get ducati speed
		ducatiSpeed = ducatiSpeed + 100;//increse it by 100
		ducati.setSpeed(ducatiSpeed);//set it to ducati
		
		int hondaSpeed = ducati.getSpeed();//get honda speed
		hondaSpeed += 100;//increse it by 100
		honda.setSpeed(hondaSpeed);//set it to honda*/

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(hero.getSpeed());

	}

}
