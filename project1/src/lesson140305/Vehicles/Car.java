package lesson140305.Vehicles;


public class Car extends Vehicle {
	
	Engine _engine;
	Wheels[] _wheel;
	Chassis _chassis;
	
	public Car(Engine engine, Wheels[] wheels, Chassis chassis){
		_engine = engine;
		_wheel = wheel;
		_chassis = chassis;
	}
		protected void mountWheels(){
		}
		protected int getNumberOfWheels{
			return _Wheels.length;
		}
		protected void mountWheel(Wheel wheel, int place) {
			_wheels[place]=wheel;
		}
		public void move(int x, int y) {
			startEngine();
			pushAccel();
			drive();
			stopEngine();
		}
			
			private void drive(){
				(for wheel in _wheel)
		}

}
