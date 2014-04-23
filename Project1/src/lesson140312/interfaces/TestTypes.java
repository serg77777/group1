package lesson140312.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestTypes {

	public static void main(String[] args) {
		
		String s = new String();
		
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Ann");
		list.add("Pete");
		
		Collections.sort(list);
		for (String string : list) {
			System.out.println(string);
		}
		
		
		String[] names = {"Steve", "Paul", "Brian"};
		Arrays.sort(names);
		for (String string : names) {
			System.out.println(string);
		}
		
		
	}
	
}
