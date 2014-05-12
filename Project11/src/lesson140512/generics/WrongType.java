package lesson140512.generics;

import java.util.Vector;

public class WrongType {

	static class VectorOfString extends Vector {
		void add(String string) {
			super.add(string);
		}

		@Override
		public String get(int index) {
			return (String) super.get(index);

		}
	}

	static class VectorOfInteger extends Vector {
		void add(Integer integer) {
			super.add(integer);
		}

		@Override
		public Integer get(int index) {
			return (Integer) super.get(index);
			
		}
	}

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("hello");
		// v.add(new Integer(10));
		String s = (String) v.get(0);

		System.out.println(s);
		VectorOfString vos = new VectorOfString();
		vos.add("hello");
		s = vos.get(0);
		System.out.println(s);
		VectorOfInteger voi = new VectorOfInteger();
		voi.add(10);	
		Integer i = voi.get(0);
		System.out.println(i);
	}

}
