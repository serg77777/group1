package lesson140320;

public class UseVehicle {
	public static void main(String[] args) {
		Car car = new Car();
		SeaTransport boat = new Boat();
		Amphiby amphiby = new Amphiby();
		AirTransport xyi = new Aero();
		Hydro h = new Hydro();
		
		
		
		car.drive();
		boat.sail();
		amphiby.drive();
		amphiby.sail();
		
		travelBySea(boat);
		travelBySea(amphiby);
travelBySea(h);		
   travelbyair(xyi);
		
	}

	private static void travelbyair(AirTransport xyi) {
		// TODO Auto-generated method stub
		xyi.fly();
		
	}

	private static void travelBySea(SeaTransport seaTransport) {
		// TODO Auto-generated method stub
		seaTransport.sail();
		
	}
}
