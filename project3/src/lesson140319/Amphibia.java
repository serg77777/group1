package lesson140319;

public class Amphibia implements AmpphibiaVehicle {

	LandVehicles car = new Car();
	SeaVehicles boat = new Boat();
	
	@Override
	public void drive(){
		car.drive();
	}
	
	@Override
	public void sail(){
		boat.sail();
	}
	
}
