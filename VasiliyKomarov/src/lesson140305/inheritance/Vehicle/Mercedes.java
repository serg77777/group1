package lesson140305.inheritance.Vehicle;

public class Mercedes extends Engine {
	
	@Override
	public void start() {
		System.out.println("mercedes engine started");
		System.out.println("vvzzzzhhhhhhh");
	}
	
	@Override
	public void stop() {
		System.out.println("mercedes engine stopped");
	}

	public void moveTo(int i, int j) {
	}
	
}
