package lesson140305.inheritance.viheclies;


public class MercedesS300 extends Car {

	public MercedesS300() {
		super(new Mercedes(), new Wheel[4], new Shassis());
		
	}
	
	@Override
	protected void mountWheels() {
		for (int i = 0; i < this.getNumberOfWheels(); i++) {
			mountWheel(new Michlen(), i);
		}
	}
	
}
