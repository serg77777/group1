package lesson140306.inheritance;

public class A {

	private int _state;

	public A() {

	}

	public A(int state) {

		setState(state);

	}

	public int getState() {

		return _state;
	}

	public void setState(int state) {

		_state = state;
	}

	public void changeState() {

		_state *= 2;
	}
}
