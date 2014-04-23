package lesson140305;

public class TestAnimals {

	public static void main(String[] args) {

		// Animal animal = new Lion();

		// trainAnimal(animal);

		// Animal animal = new Monkey();
		trainAnimal(new Lion());

		trainAnimal(new Monkey());

	}

	private static void trainAnimal(Animal animal) {

		animal.makeSound();
		animal.feed("banana");
		animal.feed("meat");
	}

}
