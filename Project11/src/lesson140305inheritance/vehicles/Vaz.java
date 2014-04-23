package lesson140305inheritance.vehicles;

public class Vaz extends Engine {
	@Override
	public void start() {
		System.out.println("Vaz engine started");
	}
	
	@Override
	public void stop() {
		System.out.println("Vaz engine stopped");
	}
}
