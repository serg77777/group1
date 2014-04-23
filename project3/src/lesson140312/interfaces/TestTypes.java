package lesson140312.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestTypes {
	public static void main(String[] args) {
		
		String s = "hello;";
		
		List<String> list = new ArrayList<String>();
		
		list.add("Ghost");
		list.add("karlson");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
		String[] names = {"Steeve", "Doothi", "Kaka"};
		Arrays.sort(names);
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
}
