package lesson140306.inheeritance;

public class Dog extends Pet {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void feed(String string) {
		makeSound();
		wag();
	}

	private void wag() {
		System.out.println("Tail wags");
	}


}
