package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {

		LandVehicle car = new Car();
		SeaVehicle boat = new Boat();
		Amphibia amphibia = new Amphibia();
		HidroPlane hidroplane = new HidroPlane();
		Airplane airplane = new Airplane();

		travelByLand(car);
		travelBySea(boat);
		travelByAir(airplane);

		travelByLand(amphibia);
		travelBySea(amphibia);

		travelByAir(hidroplane);
		travelBySea(hidroplane);
	}

	private static void travelByLand(LandVehicle landVehicle) {

		landVehicle.drive();
	}

	private static void travelBySea(SeaVehicle seaVehicle) {

		seaVehicle.sail();
	}

	private static void travelByAir(AirVehicle airVehicle) {

		airVehicle.fly();
	}
}
