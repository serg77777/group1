package lesson140319;

public class FlayCar extends Airplane implements IDrive {

	IDrive car = new Car();
	
	@Override
	public void drive() {
		car.drive();

	}

}
