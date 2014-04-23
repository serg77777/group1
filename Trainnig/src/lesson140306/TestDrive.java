package lesson140306;

import lesson140306.vehicle.LadaKalina;
import lesson140306.vehicle.MercedesS300;

public class TestDrive {
	public static void main(String[] args) {
		LadaKalina lada = new LadaKalina();
		lada.moveTo(10, 20);
		// lada.prepareWheel(); ERROR: protected
		MercedesS300 mb = new MercedesS300();
		mb.moveTo(10, 20);

		// Car car = new Car(new Engine(), new Wheel[0]);
		// car.moveTo(30, 40);
	}
}
