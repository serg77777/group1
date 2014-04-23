package lesson140305.inheritance;

public class Lion extends Animal {

	@Override
	public void makeSound() {
		System.out.println("RRrrroooaaarrr!!!");
	}

	@Override
	public void feed(String food) {
		if (food.equals("meat")) {
			System.out.println("murrrr");
		} else {
			System.out.println("?????");
		}
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}

	
	
}
