package lesson140312.intefaces;

import java.util.Iterator;

//import lesson140312.intefaces.MyList.Node;

public class MyList implements SimpleList {

	public static class Node {

		Object data;
		Node next;

		public Node(Object data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node first;
	private Node last;

	@Override
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

	public static void main(String[] args) {

		SimpleList list = new MyList();
		list.add("one");
		list.add("two");
		list.add("three");

		for (Object object : list) {
			System.out.println(object);
		}

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Override
	public Iterator iterator() {

		return new ListIterator(first);

	}

}