package lesson140319;

public final class HydroPlane extends Boat implements AirVehicle {

	private AirPlane airplane = new AirPlane();

	@Override
	public void fly() {
		airplane.fly();

	}

	// @Override ERROR: sail method is final
	// public void sail() {
	// System.out.println("Sail-sail");
	// }
}
