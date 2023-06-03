package oops.part2;

public class MountainBike extends Bycle {
	private int seatHeight;
	

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight=seatHeight;
		// TODO Auto-generated constructor stub
	}


	public int getSeatHeight() {
		return seatHeight;
	}


	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}


	@Override
	public void changeGear(int newValue) {
		// TODO Auto-generated method stub
		super.changeGear(newValue);
	}


	@Override
	public void applyBreak(int decreseSpeed) {
		// TODO Auto-generated method stub
		super.applyBreak(decreseSpeed);
	}


	@Override
	public void increseSpeed(int increment) {
		// TODO Auto-generated method stub
		super.increseSpeed(increment);
	}
	

}
