package lesson140226;

public class A {

	int state;

	public A() {

		System.out.println("New instance of A created!");
	}

	public A(int initialState) {

		this();
		state = initialState;
	}

	void changeState() {

		state++;
	}

}
