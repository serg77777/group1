package lesson140331.innerlocal;

import java.util.Iterator;

public class MyList implements Iterable {

	protected static class Node {

		private Object data;
		private Node next;

		public void setNext(Node next) {
			this.next = next;
		}
		public void setData(Object data) {
			this.data = data;
		}

		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}
		public Node getNext() {
			return next;
		}
	}

	protected Node last;
	protected Node first;

	
	public void add(Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		last = node;
	}


	@Override
	public Iterator iterator() {
		return new Iterator() {

			Node next;

			{
				next = first;
			}

			@Override
			public boolean hasNext() {
				return next != null;
			}

			@Override
			public Object next() {
				Object result = next.getData();
				next = next.next;
				return result;
			}

			@Override
			public void remove() {
			}

		};
	}
/*
	public static void main(String[] args) {

		MyList list = new MyList();
//		list.add("_one");
//		list.add("_two");
//		list.add("_three");

		// Node current = list.first(); // traverse
		// while (current != null) {
		// System.out.println(current.data);
		// current = current.next;
		// }
		//
		// for (current = list.first(); current != null; current = current.next)
		// {
		// System.out.println(current.data);
		// }

		// print(list);

		MyList strings = new MyList();
//		strings.add("one");
//		strings.add("two");
//		strings.add("three");

		// print(strings);

		for (Object x : strings) {
			for (Object y : list) {
				System.out.println(x.toString() + y.toString());
			}
		}
	}
*/
	// private static void print(Iterable<Object> list) {
	// for (Object item : list) {
	// System.out.println(item);
	// }
	// }

}