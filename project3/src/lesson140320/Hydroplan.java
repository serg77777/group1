package lesson140320;

public class Hydroplan implements SeaAirTransport {

	Boat boat = new Boat();
	Airplane  airplan = new Airplane();
	
	@Override
	public void fly(){
		airplan.fly();
	}
	
	@Override
	public void sail(){
		boat.sail();
	}
	
}
