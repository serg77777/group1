package lesson140319;

public class Boat implements SeaVehicle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see lesson140319.SeaVehicle#sail()
	 */
	@Override
	final public void sail() {
		System.out.println("sailing");
	}
}
