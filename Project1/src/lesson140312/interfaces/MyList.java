package lesson140312.interfaces;

import java.util.Iterator;

public class MyList implements SimpleList, Iterator {

	private static class Node {

		private final  Object data;
		 private Node next;
		
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
	
	Node first;
	Node last;
	Node  current;
	
	@Override
	public void add(Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = null;
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
		list.add("tree");
		
		/*Node current = list.first();
		while ( current != null ) {
			System.out.println(current.data);
			current = current.getNext();
		}
		арпотыыыыыыыыы
		for (current = list.first(); current != null; current = current.getNext()) {
			System.out.println(current.data);
		}*/
		
		printItarable(list);
		
	}

	private static void printItarable(Iterable list) {
		for (Object item : list) {
			System.out.println(item);
		}
	}


	@Override
	public Iterator iterator() {
		current = first;
		return this;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return (current != null);
	}

	@Override
	public Object next() {
		Object res = current.data;
		current = current.next;
		return res;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
