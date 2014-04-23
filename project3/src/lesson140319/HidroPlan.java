package lesson140319;

public final class HidroPlan extends Boat implements AirVehicles {
	
	private final Airplane airplane = new Airplane();

	@Override
	public void fly() {
		airplane.fly();
	}
	
/*	@Override
	public void sail() {
		
	} 			ERROR: final method */ 

}
