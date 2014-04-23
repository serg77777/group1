package lesson140306.vehicle;

public abstract class Car extends Vehicle {

	Engine _engine;
	Wheel[] _wheels;

	public Car(Engine engine, Wheel[] wheels) {
		_engine = engine;
		_wheels = wheels;
		mountWheels();

	}

	private void mountWheels() {
		for (int i = 0; i < _wheels.length; i++) {
			_wheels[i] = prepareWheel();
		}
	}

	protected Wheel prepareWheel() {
		return null;
	}

	@Override
	public void moveTo(int x, int y) {
		startEngine();
		pushAccelerator();
		drive();
		stop();
	}

	private void stop() {
		_engine.stop();
		System.out.println("Engine stopped");

	}

	private void drive() {
		System.out.println("Moves to destination");
		for (Wheel wheel : _wheels) {
			wheel.makeSound();
		}

	}

	private void pushAccelerator() {
		System.out.println("Pushed accelerator");

	}

	private void startEngine() {
		_engine.start();
		System.out.println("Engine started");

	}
}
