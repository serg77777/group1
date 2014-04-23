package lesson140319;

public final class Hydroplane extends Boat implements AirVehicle{
	
	private Airplane airplane = new Airplane();

	@Override
	public void fly() {
		airplane .fly();
		
	}

	@Override
	public void sail(){
		System.out.println("sail");
	}
}
