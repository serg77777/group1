package lesson140319;

import lesson140319.Airplane;

public final class HidroPlan extends Boat  implements AirVehicle {
	
	private Airplane airplane = new Airplane();

	@Override
	public void fly() {
		 airplane.fly();
		
	}
	
	@Override
	public void sail() {
		System.out.println("my sail");
	}

}
