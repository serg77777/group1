package lesson140514.generics;

import java.util.Arrays;
import java.util.List;

public class WildcardSuperExtends {

	public static void main(String[] args) {

		List<Object> objs = Arrays.<Object> asList(2, 3.14, "hello");
		List<Integer> ints = Arrays.asList(5, 6, 7);
		List<Integer> intDst = Arrays.asList(1, 2, 3);

		WildcardSuperExtends.<Integer> copy(ints, objs);
		copy2(ints, intDst);
	}

	public static <T> void copy(List<? extends T> src, List<? super T> dst) {

		for (int i = 0; i < src.size(); i++) {
			dst.set(i, src.get(i));
		}
	}

	public static <T> void copy2(List<T> src, List<T> dst) {

		for (int i = 0; i < src.size(); i++) {
			dst.set(i, src.get(i));
		}
	}
}
