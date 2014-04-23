package lesson140306.vehicle;

public class Dog extends Pet {

	@Override
	public void makeSound() {
		System.out.println("Bow-wow");

	}

	@Override
	public void feed(String food) {
		makeSound();
		wag();

	}

	private void wag() {
		System.out.println("Wag a tail");

	}

}
