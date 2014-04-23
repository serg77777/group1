package lesson140306.vehicle;

public class Cat extends Pet {

	@Override
	public void makeSound() {
		System.out.println("Meow");

	}

	@Override
	public void feed(String food) {
		makeSound();

	}

}
