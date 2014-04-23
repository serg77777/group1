package lesson140320;

public class UseV {

	public static void main(String[] args) {
		
		Car car = new Car();
		SeaTransport boat = new Boat();
		AirTransport airplane = new Airplane();
		Hydroplan hydroplan = new Hydroplan();
		Amphibia amphibia = new Amphibia();
		JBCar jbcar = new JBCar();
		
		car.drive();
		boat.sail();
		airplane.fly();
		
		amphibia.drive();
		amphibia.sail();
		
		travelBySea(boat);
		travelBySea(amphibia);
		travelBySea(hydroplan);
		
		travelByAir(airplane);
		travelByAir(hydroplan);

		travelByAir(jbcar);
		travelBySea(jbcar);
		travelByLand(jbcar);
		
		
	
	}

	private static void travelByLand(LandTransport landTransport) {
		landTransport.drive();
				
	}

	private static void travelByAir(AirTransport airTransport) {
		airTransport.fly();
		
	}

	private static void travelBySea(SeaTransport seaTransport) {
		seaTransport.sail();
	}
	
}
