package lesson140306.inheritance;

public class B extends A {

	// public B() {
	// super(13);
	// }
	public void printState() {
		System.out.println(getState());
	}

	@Override
	public void changeState() {
		setState(getState() * 3);
	}
}
