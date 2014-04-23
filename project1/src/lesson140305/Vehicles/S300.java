package lesson140305.Vehicles;

public class S300 extends Car {

	public S300() {

		super(new Mercedes(), new Wheels[4], new Chassis());

	}

	protected void mountWheels() {

		for (int i = 0; i < 4; i++)
			mountWheel(new Michelin(), i);
	}
}
