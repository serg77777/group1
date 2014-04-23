package lesson140319;

public class B {
	final int state; // можно сделать так = 1;

	{
		// state = 10; или так
	}

	public B(int initialState) {
		state = initialState; // лучше всего так
	}
}
