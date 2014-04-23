package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {
		
	Car car = new Car();
	Boat boat = new Boat();
	Amphibia amphibia = new Amphibia();
	Airplane airplane = new Airplane();
	HidroPlan hidroplane = new HidroPlan();
	
	travelByLand(amphibia);
	travelBySea(amphibia);
	
	travelByAir(airplane);
	
	travelByAir(hidroplane);
	travelBySea(hidroplane);
	
	}

	private static void travelByAir(AirVehicle airplane) {
		airplane.fly();
	}

	private static void travelBySea(SeaVehicle boat) {
		boat.sail();
	}

	private static void travelByLand(LandVehicle landVehicle) {
		landVehicle.drive();
	}
	
}
