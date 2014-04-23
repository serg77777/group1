package lesson140319;

public class Amfibia implements IAmfibia {

	IDrive car  = new Car();
	
	ISeeVehicle boat = new Boat();
	
	@Override
	public void drive(){
		car.drive();
	}
	
	@Override
	public void sail(){
		boat.sail();
	}
	
}
