package lesson140305inheritance;

public class TestAnimals {
	public static void main(String[] args) {
		train(new Lion());

		train(new Monkey());
	}

	private static void train(AnimalPlanet an) {
		an.makeSound();
		an.feed("banana");
		an.feed("meat");
	}
}
