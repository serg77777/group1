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
			_wheels[i] = createWheel();
		}
	}


	protected Wheel createWheel() {
		return null;
	}


	@Override
	public void moveTo(int x, int y) {
		startEngine();
		pushAcceleration();
		drive();
		stopEngine();
	}

	private void startEngine() {
		_engine.start();
		System.out.println("engaine started");
	}

	private void pushAcceleration() {
		System.out.println("push acceleration");
		
	}

	private void drive() {
		System.out.println("moves to destination");
		for (Wheel wheel : _wheels) {
			wheel.makeSound();
		}
		
	}

	private void stopEngine() {
		_engine.stop();
		System.out.println("stop engine");
		
	}
	
}
