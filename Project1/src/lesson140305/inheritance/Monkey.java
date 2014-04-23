package lesson140305.inheritance;

public class Monkey extends Animal {

	@Override
	public void makeSound() {
		System.out.println("woop");
		
	}

	@Override
	public void feed(String food) {
		
		if(food.equals("banana")){
			System.out.println("whoooooooop!");
		}
		else{
			System.out.println("Go away, stupid programmer!");
		}
		
	}

	@Override
	protected void walk() {
		// TODO Auto-generated method stub
		
	}

}
