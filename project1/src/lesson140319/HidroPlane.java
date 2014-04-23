package lesson140319;

public final class HidroPlane extends Boat implements AirVehicle {

	private Airplane airplane = new Airplane();

	@Override
	public void fly() {

		airplane.fly();
	}

}
