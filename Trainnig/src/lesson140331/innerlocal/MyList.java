package lesson140331.innerlocal;

import java.util.Iterator;

public class MyList implements SimpleList {

	protected static class Node {

		private final Object _data;
		private Node _next;

		public Node(Object data, Node next) {

			_data = data;
			_next = next;
		}

		public Object getData() {

			return _data;
		}

		public Node getNext() {

			return _next;
		}
	}

	protected Node last;
	protected Node first;

	@Override
	public Iterator iterator() {

		return new ListIterator(first);

	}

	@Override
	public void add(Object object) {

		Node node = new Node(object, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last._next = node;
		}
		last = node;
	}

	/*
	 * public static void main(String[] args) {
	 * 
	 * SimpleList list = new MyList(); list.add("one"); list.add("two");
	 * list.add("three");
	 * 
	 * 
	 * Node current = list.first(); //traverse while (current != null) {
	 * System.out.println(current.data); current = current.next; }
	 * 
	 * for (current = list.first(); current != null; current = current.next) {
	 * System.out.println(current.data); }
	 * 
	 * 
	 * print(list);
	 * 
	 * ArrayList strings = new ArrayList(); strings.add("раз");
	 * strings.add("два"); strings.add("три");
	 * 
	 * print(strings); }
	 */

	private static void print(Iterable list) {

		for (Object item : list) {
			System.out.println(item);
		}
	}

}
