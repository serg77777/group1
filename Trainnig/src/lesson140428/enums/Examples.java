package lesson140428.enums;

public class Examples {

	enum Apple {
		Jonathan, GoldenDel, RedDel, Winesap, Cortland
	}

	public static void main(String[] args) {

		Apple ap = Apple.Cortland;
		switch (ap) {
		case Cortland:
			System.out.println(ap);
			break;
		default:
			break;
		}
		for (Apple a : Apple.values()) {
			System.out.println(a);
		}
		System.out.println(Apple.valueOf("Cortland"));
	}
}
