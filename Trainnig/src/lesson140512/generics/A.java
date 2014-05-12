package lesson140512.generics;

public class A<T> {

	private T _state;

	public A(T state) {

		_state = state;
	}

	T getState() {

		return _state;
	}

	void setState(T state) {

		_state = state;
	}

	public static void main(String[] args) {

		A<String> as = new A<>("hello");
		as.setState("hi");
		// Integer i = as.getState(); Error
		String s = as.getState();
		A<Integer> ai = new A<>(15);
		// s= ai.getState(); Error
		Integer i = ai.getState();

		System.out.println(s);
		System.out.println(i);

	}
}
