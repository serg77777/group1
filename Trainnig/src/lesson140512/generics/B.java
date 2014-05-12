package lesson140512.generics;

public class B<T extends Number> {

	private T _state;

	public B(T state) {

		_state = state;
	}

	public T getState() {

		return _state;
	}

	public static void main(String[] args) {

		// B<String> b = new B<>("Hello"); compile error
		B<Integer> b1 = new B<>(10);
		B<Double> b2 = new B<>(11.25);
		B<Number> b3 = new B<Number>(10);
		// B<Number> b4 = new B<Integer>(15);
		// B<Integer> не наследует от B<Number>
		B<? extends Number> b5 = new B<Integer>(15);
		B<?> b6 = new B<Integer>(27);
		B b7 = new B<Float>(25.0f);
		B b8 = new B(25.0f);
		b8.getState();
		b6.getState();
	}
}
