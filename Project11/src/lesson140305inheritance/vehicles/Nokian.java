package lesson140305inheritance.vehicles;

public class Nokian extends Wheel {
	@Override
	public void makesound() {
		// TODO Auto-generated method stub
		System.out.print("wooooooo ");
		super.makesound();
		System.out.println("bla");
	}
}
