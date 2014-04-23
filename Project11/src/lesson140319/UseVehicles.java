package lesson140319;

public class UseVehicles {
	
	public static void main(String[] args) {
		
		LandVehicle car = new Car();
		SeaVehicle boat = new Boat();
		Amphibia amphibia = new Amphibia();
		Airplane airplane = new Airplane();
		HidroPlan hidroPlan = new HidroPlan();
		
		travelByLand(car);
		travelBySea(boat);
		travelByAir(airplane);
		
		travelByLand(amphibia);
		travelBySea(amphibia);

		travelByAir(hidroPlan);
		travelBySea(hidroPlan);
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
