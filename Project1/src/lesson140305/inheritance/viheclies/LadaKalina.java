package lesson140305.inheritance.viheclies;


public class LadaKalina extends Car {

	public LadaKalina() {
		
		super(new Vaz(), new Wheel[4], new Shassis());
		
	}
	
	@Override
	protected void mountWheels() {
		for (int i = 0; i < getNumberOfWheels(); i++) {
			mountWheel(new Wheel(), i);
		}
	}
	
}
