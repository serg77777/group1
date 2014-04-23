package lesson140319;

import lesson140306.vehicle.Airplane;

public class HydroPlan extends Boat implements AirVehicle {
	
	private Airplane2 airplane = new Airplane2();

	public void fly() {
		airplane.fly();
	}
	
	
}
