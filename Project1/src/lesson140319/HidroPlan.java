package lesson140319;

public final class HidroPlan extends Boat implements AirVehicle {

	private final Airplane airplane = new Airplane();
	
	@Override
	public void fly() {
		airplane.fly();
	}
	
	@Override
	public void sail() {
		// TODO Auto-generated method stub
		System.out.println("my sail");
	}
	
}
