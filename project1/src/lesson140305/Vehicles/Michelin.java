package lesson140305.Vehicles;

public class Michelin extends Wheels {

	public void makeSound() {

		System.out.println("woooo");
		super.makeSound();
		System.out.println("wheee");
	}

}
