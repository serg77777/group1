package lesson140512.generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Pair<K, V> {

	private K _key;
	private V _value;

	public Pair(K key, V value) {

		_key = key;
		_value = value;
	}

	public K key() {

		return _key;
	}

	public V value() {

		return _value;
	}

	public static void main(String[] args) {

		Pair<Integer, String> pis = new Pair<>(15, "Hi");
		Pair<String, String> pss = new Pair<>("Bye", "Hi");
		Pair<Integer, A<String>> pia = new Pair<>(25, new A<>("Hi"));

		List<List<String>> listOfListsOfStrings = new LinkedList<List<String>>();
		listOfListsOfStrings.add(Arrays.asList("one", "two", "three"));
		listOfListsOfStrings.add(Arrays.asList("four", "five", "six"));
		for (List<String> list : listOfListsOfStrings) {
			System.out.println(list);
		}
	}
}
