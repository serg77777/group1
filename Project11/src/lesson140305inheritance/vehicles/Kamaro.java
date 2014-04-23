package lesson140305inheritance.vehicles;

public class Kamaro extends Car {

	public Kamaro() {
		super(new Mercedes(), new Wheel[4], new Chassis());
	}
@Override
protected void mountWheels() {
for (int i = 0; i < 4; i++) {
	Wheel(new Nokian(),i);
}

}
}
