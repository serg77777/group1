package lesson140320;

public class JamesBondCar extends Car implements SeaTransport, AirTransport{
	
	Airplane plane = new Airplane();
	Boat boat = new Boat();
	
	@Override
	public void fly(){
		plane.fly();
	}
		
	@Override
	public void sail(){
		boat.sail();
	}


}
