package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {
		AirPlane airplane = new AirPlane();
		LandVehicle car = new Car();
		SeaVehicle boat = new Boat();
		Amphibia amphibia = new Amphibia();
		HydroPlane hydroplane = new HydroPlane();

		travelByLand(car);
		travelBySea(boat);
		travelByLand(amphibia);
		travelBySea(amphibia);
		travelByAir(airplane);
		travelByAir(hydroplane);
		travelBySea(hydroplane);
	}

	private static void travelByAir(AirVehicle airVehicle) {
		airVehicle.fly();

	}

	private static void travelBySea(SeaVehicle seaVehicle) {
		seaVehicle.sail();
	}

	private static void travelByLand(LandVehicle landVehicle) {
		landVehicle.drive();
	}
}
