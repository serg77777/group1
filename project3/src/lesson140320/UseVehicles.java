package lesson140320;

public class UseVehicles {

	public static void main(String[] args) {
		Car car = new Car();
		SeaTransport boat = new Boat();
		Amphibia amphibia = new Amphibia();
		Hydroplan hydroplan = new Hydroplan();
		
		car.drive();
		boat.sail();
		amphibia.drive();
		amphibia.sail();

	travelBySea(boat);
	travelBySea(amphibia);
	travelBySea(hydroplan);
	
	travelByLand(car);
	}
		
	public static void travelBySea(SeaTransport seaTransport){
		seaTransport.sail();
	}
	
	public static void travelByAir(AirTransport airTransport){
		airTransport.fly();
	}
	
	public static void travelByLand(LandTransport landTransport){
		landTransport.drive();
	}
}
