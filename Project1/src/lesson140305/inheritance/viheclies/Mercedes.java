package lesson140305.inheritance.viheclies;


public class Mercedes extends Engine {

	@Override
	public void start() {
		System.out.println("mercedes engine started");
	}
	
	@Override
	public void stop() {
		System.out.println("mercedes stopped");
	}
	
}
