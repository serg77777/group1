package lesson140305inheritance.vehicles;

public class Car extends Vehicle {

	Engine _engine;
	Wheel[] _wheels;
	Chassis _chassis;

	public Car(Engine engine, Wheel[] wheels, Chassis chassis) {
		_engine = engine;
		_wheels = wheels;
		mountWheels();
		_chassis = chassis;
	}

	protected void mountWheels() {

	}

	protected int getNum() {
		return _wheels.length;
	}

	protected void Wheel(Wheel wheel, int place) {
		_wheels[place] = wheel;
	}

	@Override
	public void moveTo(int x, int y) {
		startEngine();
		pushAccelerator();
		waitSomeTime();
		stopEngine();
	}

	private void startEngine() {
		_engine.start();
		System.out.println(this + " started engine");
	}

	private void pushAccelerator() {
		System.out.println(this + " pushed Accelerator");
	}

	private void waitSomeTime() {
		for (Wheel wheel : _wheels) {
			wheel.makesound();
		}
		
		System.out.println(this + " wait");
	}

	private void stopEngine() {
		_engine.stop();
		System.out.println(this + " stopped engine");
	}

}
