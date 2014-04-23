package lesson140305.inheritance;

public class TestAnimals {

	public static void main(String[] args) {
		
		/*Animal animal = new Animal();
		animal.makeSound();
		animal.feed("Stone");*/
		
		train(new Lion());
		
		train(new Monkey());
		
	}

	private static void train(Animal animal) {
		animal.makeSound();
		animal.feed("banana");
		animal.feed("meat");
	}
	
}
