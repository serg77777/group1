package lesson140305;

public class Lion extends Animal {

	@Override
	public void makeSound() {

		System.out.println("RRRRRRRRRrrr!");
	}

	@Override
	public void feed(String food) {

		if (food.equals("meat")) {
			System.out.println("murr");
		} else {
			System.out.println("?");

			System.out.println("RRRRRRRRRrrr!");
		}
	}
}