package lesson140305inheritance.vehicles;

public class LadaKalina extends Car {
	public LadaKalina(){
		super(new Vaz(), new Wheel[4], new Chassis());
	}
	
	@Override
	protected void mountWheels() {
		for (int i = 0; i < getNum(); i++) {
		Wheel(new Wheel(), i);	
		}
	}
}
