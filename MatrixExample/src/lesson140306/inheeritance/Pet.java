package lesson140306.inheeritance;

public abstract class Pet extends Animal {

	public void brush() {
		System.out.println("Brashed " + this);
	}
	
	@Override
	public void takeCare() {
		super.takeCare();
		brush();
	}

}
