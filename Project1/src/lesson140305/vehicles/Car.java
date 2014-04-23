package lesson140305.vehicles;

public class Car extends Vehicle {

	Engine _engine;
	Wheel[] _wheels;
	Chassis _chassis;
	
	public Car(Engine engine, Wheel[] wheels, Chassis chassis){
		_engine =engine;
		_chassis = chassis;
		_wheels = wheels;
	}
	
	@Override
	public void moveTo(int x, int y)
	{
		
	}
}
