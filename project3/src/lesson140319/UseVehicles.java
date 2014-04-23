package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {
		LandVehicles car = new Car();
		SeaVehicles boat = new Boat();
		Amphibia amphibia = new Amphibia();
		Airplane airplane = new Airplane();
		HidroPlan hidroPlan = new HidroPlan();

		travelBySea(boat);
		travelByLand(car);
		travelBySea(amphibia);
		travelByLand(amphibia);
		
		travelByAir(airplane);
		
		travelByAir(hidroPlan);
		travelBySea(hidroPlan);
	}

	private static void travelByAir(AirVehicles airVehicle) {
		airVehicle.fly();
	}

	private static void travelByLand(LandVehicles landVehicle) {
		landVehicle.drive();
	}

	private static void travelBySea(SeaVehicles seaVehicle) {
		seaVehicle.sail();		
	}

}
