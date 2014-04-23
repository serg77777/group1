package lesson140409.jvm;

public class A {

	int _state = 10;

	public void changeState() {

		System.out.println("State changing");
		_state += 10;
	}
}
