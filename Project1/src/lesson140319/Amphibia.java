package lesson140319;

public class Amphibia implements AmphibiaVehicle {

	LandVehicle car = new Car();
	SeaVehicle boat = new Boat();
	
	
	@Override
	public void drive() {
		car.drive();
	}
	@Override
	public void sail() {
		boat.sail();
	}
	
}
