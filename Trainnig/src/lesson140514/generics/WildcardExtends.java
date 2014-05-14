package lesson140514.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildcardExtends {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Float> list3 = new LinkedList<>();

		print(list);
		sum(list2);
		sum(list3);
		// sum(list); compile error
	}

	private static double sum(List<? extends Number> list2) {

		double sum = 0;
		for (Number number : list2) {
			sum += number.doubleValue();
		}
		return sum;
	}

	private static void print(List<?> list) {

		for (Object object : list) {
			System.out.println(object);
		}
	}
}
