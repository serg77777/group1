package lesson140512.generics;

public class A<T> {

	T state;

	public A(T state) {
		this.state = state;
	}

	T getState() {
		return state;
	}

	public static void main(String[] args) {
		A<String> a = new A<>("hello");
		String s = a.getState();
		A<Integer> a1 = new A<>(10);
		Integer i = a1.getState();

	}

}
