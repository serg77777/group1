package lesson140305.inheritance.viheclies;


public class Car extends Vihecle {

	Engine _engine;
	Wheel [] _wheels;
	Shassis _shassis;
	public Car(Engine engine, Wheel[] wheels, Shassis shassis) {
		super();
		_engine = engine;
		_wheels = wheels;
		mountWheels();
		_shassis = shassis;
	}
	
	protected void mountWheels() {
		
	}
	
	protected int getNumberOfWheels() {
		return _wheels.length;
	}
	
	protected void mountWheel(Wheel wheel, int place) {
		_wheels[place] = wheel;
	}

	@Override
	public void moveTo(int x, int y) {
		startEngine();
		pushAccelerator();
		drive();
		stopEngine();
	}

	private void stopEngine() {
		_engine.stop();
		System.out.println(this + " stoped engine");
	}

	private void drive() {
		for (Wheel wheel : _wheels) {
			wheel.makeSound();
		}
		System.out.println(this + " drive");
	}

	private void pushAccelerator() {
		System.out.println(this + " pushed accel");
	}

	private void startEngine() {
		_engine.start();
		System.out.println(this +  " started engine");
	}
	
}
