package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {
		
		IDrive car = new Car();
		ISeeVehicle boat = new Boat();
		Amfibia amfibia = new Amfibia();
		Airplane airplane = new Airplane();
		Hydroplane hidra = new Hydroplane();
		
		travelByLand(car);
		
		travelBySea(boat);
		
		travelByLand(amfibia);
		travelBySea(amfibia);
		
		travelByAir(airplane);
		
		travelByAir(hidra);
		travelBySea(hidra);
		
	}

	private static void travelByAir(AirVehicle airVehicle) {
		airVehicle.fly();
		
	}

	private static void travelBySea(ISeeVehicle boat) {
		boat.sail();
		
	}

	private static void travelByLand(IDrive car) {
		car.drive();
		
	}
	
}
