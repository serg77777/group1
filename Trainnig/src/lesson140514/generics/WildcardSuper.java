package lesson140514.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WildcardSuper {

	public static void main(String[] args) {

		List<Integer> iList = new ArrayList<>();
		List<Float> fList = new LinkedList<>();
		fill(iList, 10, 0);
		// fill(fList, 10, 0.0);
	}

	private static void fill(List<Integer> iList, int qty, int value) {

		for (int i = 0; i < qty; i++) {
			iList.add(value);
		}
	}
}
