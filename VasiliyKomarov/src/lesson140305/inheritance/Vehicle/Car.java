package lesson140305.inheritance.Vehicle;

public class Car extends Vehicle {

	Engine _engine;
	Wheel[] _wheels;
	Chassis _chassis;
	
	public Car(Engine engine, Wheel[] wheels, Chassis chassis) {
		super();
		_engine = engine;
		_wheels = wheels;
		mountWheels();
		_chassis = chassis;
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

private void startEngine() {
	_engine.start();
	System.out.println(this + " started");
}

private void pushAccelerator() {
	System.out.println(this + " push acce");
	
}

private void drive() {
	for (Wheel wheel : _wheels) {
//		makeSound();
	}
	System.out.println(this + " drives");
}


private void stopEngine() {
	System.out.println(this + " stopped");
	_engine.stop();
}
	
}
