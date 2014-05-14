package lesson140514.generics;

import java.util.List;

public class GenericLimitations {

	static class Primitive<T> {

	}

	static class A<T> {

	}

	static class InstanceOfTypeParameter {

		public static <E> void foo(List<E> list) {

			// if(list instanceof ArrayList<Integer>){
			//
			// }
		}
	}

	public static void main(String[] args) {

		// Primitive<int> p = new Primitive<>();
		// T t = new T();
	}
}
