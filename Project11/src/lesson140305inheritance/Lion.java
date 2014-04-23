package lesson140305inheritance;

public class Lion extends AnimalPlanet {
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("я-тигр");
	}

	@Override
	public void feed(String food) {
		// TODO Auto-generated method stub
		if (food.equals("meat")) {
			System.out.println("Жир");
		} else {
			System.out.println("Риж");
		}
	}
	
	@Override
	public void go() {
		// TODO Auto-generated method stub
		
	}
}
