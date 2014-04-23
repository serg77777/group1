package lesson140306.vehicle;

public class Monkey extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Whoop-whoop-whoop-whoop");

	}

	@Override
	public void feed(String food) {
		if (food == "banana") {
			makeSound();
		} else {
			System.out.println("Silence");
		}

	}

}
