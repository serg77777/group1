package lesson140306.vehicle;

public abstract class Pet extends Animal {

	@Override
	public void takeCare() {
		super.takeCare();
		brush();
	}

	public void brush() {
		System.out.println("Fur is clean now!");
	}
}
