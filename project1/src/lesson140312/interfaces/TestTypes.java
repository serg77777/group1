package lesson140312.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTypes {

	public static void main(String[] args) {

		String s = "Hello";

		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Ann");
		list.add("Pete");

		Collections.sort(list);

		String[] names = { "John", "George", "Paul", "Ringo" };
		for (int i = 0; i < names.length; i++) {
			System.out.println(names);
		}

		Arrays.sort(names);

	}

}
