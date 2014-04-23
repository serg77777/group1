package lesson140305.inheritance;

public class Monkey extends Animal {

	@Override
	public void makeSound() {
		System.out.println("woop-woop");
	}

	@Override
	public void feed(String food) {
		if (food.equals("banana")) {
			System.out.println("whoooop!");
		}
		else {
			System.out.println("... ?!");
		}
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}

}
