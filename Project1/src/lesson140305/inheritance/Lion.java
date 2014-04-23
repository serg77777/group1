package lesson140305.inheritance;

public class Lion extends Animal {

	@Override
	public void makeSound() {
		System.out.println("Rrrrraaaar!");
		
	}

	@Override
	public void feed(String food) {
		if(food.equalsIgnoreCase("meat")){
			System.out.println("Mauuuuuu");
		}else{
			makeSound();
		}
		
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}

}
