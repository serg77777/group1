package lesson140305inheritance;

public class Monkey extends AnimalPlanet {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("yy-yy-aa-aa-yy");
	}

	@Override
	public void feed(String food) {
		// TODO Auto-generated method stub
		if (food.equals("banana")) {
			System.out.println("Yep");
		} else {
			System.out.println("%(");
		}
	}
	@Override
	protected void go() {
		// TODO Auto-generated method stub
		
	}
}
