package lesson140305inheritance.vehicles;

public class Driver {
public static void main(String[] args) {
	LadaKalina lada = new LadaKalina();
	lada.moveTo(10, 20);
	Kamaro kam = new Kamaro();
	kam.moveTo(50, 15);
}
}
