package lesson140305.inheritance.Vehicle;

public class Michelin extends Wheel {

	public void makeSound() {
		System.out.println("wwwwwooooowwww");
		super.makeSound();
		System.out.println("wheeeeeee");
	}
	
}
