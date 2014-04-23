package lesson140320;

public class JBCar extends Car implements  SeaAirTransport {
	
	Airplane airplane = new Airplane();
	Boat boat = new Boat();
	
	@Override
	public void fly() {

		airplane.fly();
	}
	
	@Override
	public void sail() {
		boat.sail();
	}
	
}
