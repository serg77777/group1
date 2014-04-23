package lesson140319;

public class HidroPlan extends Boat implements AirVehicle {

	public Airplane airplane = new Airplane();

	@Override
	public void fly() {
		airplane .fly();
	}
	
	@Override
	public void sail() {
		System.out.println("mysail");
	}
	
	
}
