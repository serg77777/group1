package lesson140512.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GenEx {

	static class A {

	}

	public static void main(String[] args) {

		Vector<String> vs = new Vector<>(); // <> diamond operator
		// vs.add(new Integer(10));
		vs.add("Hello");

		Vector<Integer> vi = new Vector<>();
		// vi.add("Hello");
		vi.add(10);
		int i = vi.get(0);
		System.out.println(i);
		List<A> list = new ArrayList<>();
		list.add(new A());
		A a = list.get(0);
		System.out.println(a);
	}
}
