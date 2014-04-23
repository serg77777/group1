package lesson140305.inheritance.viheclies;


public class Michlen extends Wheel {
	@Override
	public void makeSound() {
		System.out.println("wooooow");
		super.makeSound();
		System.out.println("wheeee");
	}
}
