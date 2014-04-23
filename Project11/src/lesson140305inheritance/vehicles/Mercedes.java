package lesson140305inheritance.vehicles;

public class Mercedes extends Engine {
	@Override
	public void start() {
		System.out.println("Mercedes engine started. Vvvvzhzhhzhzhzhzhzhh");
	}
	
	@Override
	public void stop() {
		System.out.println("Mercedes engine stopped");
	}
}