package lesson140312.interfaces;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList implements SimpleList, Iterator {
	private static class Node {
		private final Object data;
		private Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	Node last;
	Node first;
	Node current;

	@Override
	public Iterator iterator() {
		current = first;
		return this;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public Object next() {
		Object result = current.data;
		current = current.next;
		return result;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(String element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		last = node;
	}

	public static void main(String[] args) {
		SimpleList list = new MyList();
		list.add("one");
		list.add("two");
		list.add("three");

		/*
		 * Node current = list.first(); //traverse while (current != null) {
		 * System.out.println(current.data); current = current.next; }
		 * 
		 * for (current = list.first(); current != null; current = current.next)
		 * { System.out.println(current.data); }
		 */

		print(list);

		ArrayList strings = new ArrayList();
		strings.add("раз");
		strings.add("два");
		strings.add("три");

		print(strings);
	}

	private static void print(Iterable list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}

}
