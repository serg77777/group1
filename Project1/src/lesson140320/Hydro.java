package lesson140320;

public class Hydro implements SeaTransport, AirTransport {
	Boat y = new Boat();
	AirTransport a = new Aero();
	
	@Override
	public void fly(){
		a.fly();
	}
	@Override
	public void sail(){
		y.sail();
	}

}
