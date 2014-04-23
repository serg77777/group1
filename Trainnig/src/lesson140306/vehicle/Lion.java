package lesson140306.vehicle;

public class Lion extends Animal {
	@Override
	public void makeSound() {
		System.out.println("RRRROOOOAAARRR");

	}

	@Override
	public void feed(String food) {
		if (food == "meat") {
			System.out.println("Purrr");
		} else {
			makeSound();
		}

	}
}
