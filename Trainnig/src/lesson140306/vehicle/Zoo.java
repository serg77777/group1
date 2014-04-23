package lesson140306.vehicle;

public class Zoo {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Monkey monkey = new Monkey();
		// Animal animal = new Animal(); ERROR: abstract class

		lion.takeCare();
		monkey.takeCare();
		new Cat().takeCare();
		new Dog().takeCare();

	}
	// Refactored: envy function
	/*
	 * public static void takeCare(Animal animal) { animal.makeSound();
	 * animal.feed("banana"); animal.feed("meat"); if (animal instanceof Pet) {
	 * ((Pet) animal).brush(); } }
	 */
}
