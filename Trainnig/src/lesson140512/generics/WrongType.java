package lesson140512.generics;

import java.util.Vector;

public class WrongType {

	static class VectorWithStrings extends Vector {

		void add(String string) {

			super.add(string);
		}

		String getAtIndex(int index) {

			return (String) super.get(index);
		}
	}

	static class VectorWithIntegers extends Vector {

		void add(Integer integer) {

			super.add(integer);
		}

		Integer getAtIndex(int index) {

			return (Integer) super.get(index);
		}
	}

	public static void main(String[] args) {

		Vector v = new Vector(); // динамический массив
		v.add("Hello.");
		// v.add(new Integer(10));
		String s = (String) v.get(0);
		System.out.println(s);

		VectorWithStrings vs = new VectorWithStrings();
		vs.add("Hello");
		s = vs.getAtIndex(0);
		System.out.println(s);

		VectorWithIntegers vi = new VectorWithIntegers();
		vi.add(new Integer(10));
		Integer i = vi.getAtIndex(0);
		System.out.println(i);
	}
}
