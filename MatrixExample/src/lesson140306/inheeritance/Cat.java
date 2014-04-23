package lesson140306.inheeritance;

public class Cat extends Pet {

	@Override
	public void makeSound() {
		System.out.println("muuurrrr");
	}

	@Override
	public void feed(String string) {
		makeSound();
		wag();
	}

	private void wag() {
		
	}

}
