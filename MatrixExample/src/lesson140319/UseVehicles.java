package lesson140319;

public class UseVehicles {
	
	public static void main(String[] args) {
		LandVehicle car = new Car();
		SeaVehicle boat = new Boat();
		Amphibia amphibia = new Amphibia();
		AirVehicle airplane = new Airplane2();
		HydroPlan hydroplan = new HydroPlan();
		
		travelByLand(car);
		travelBySea(boat);
		travelByLand(amphibia);
		
		travelByLand(amphibia);
		travelBySea(amphibia);
		
		travelByAir(hydroplan);
		travelBySea(hydroplan);
	}

	private static void travelByAir(AirVehicle airVehicle) {
		airVehicle.fly();
	}

	private static void travelBySea(SeaVehicle seaVehiclet) {
		seaVehiclet.sail();
	}

	private static void travelByLand(LandVehicle landVehicle) {
		landVehicle.drive();
	}
}
