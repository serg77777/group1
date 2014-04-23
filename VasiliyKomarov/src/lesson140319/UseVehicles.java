package lesson140319;

public class UseVehicles {

	public static void main(String[] args) {
		Car car = new Car();
		Boat boat = new Boat();
		Amphibia amphibia = new Amphibia();
		Airplane airplane = new Airplane();
		HidroPlan hidroplan = new HidroPlan(); 
		
		travelByLand(car);
		
		travelBySea(boat);
		travelByAir(airplane);
		
		travelByLand(amphibia);
		travelBySea(amphibia);
		
		
		travelByAir(hidroplan);	
		travelByAir(hidroplan);	
	}
	
	private static void travelBySea(SeaVehicle seaVechicle) {
		seaVechicle.sail();
	}
	private static void travelByLand(LandVehicle landVehicle) {
		landVehicle.drive();
	}
	
	private static void travelByAir(AirVehicle airVehicle) {
	airVehicle.fly();
}

private static void travelByLand(Car car) {
	// TODO Auto-generated method stub
	
	}
	}
	

