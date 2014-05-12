package lesson140512.generics;

public class D extends A<String> {

	public D(String state) {

		super(state);
	}

	public static void main(String[] args) {

		D d = new D("hello");
		String s = d.getState();
		System.out.println(s);
	}
}
