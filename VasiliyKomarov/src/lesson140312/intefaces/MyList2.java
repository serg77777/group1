package lesson140312.intefaces;

import java.util.Iterator;

public class MyList2 implements SimpleList, Iterator {

	private static class Node {
		
		static int counter;
		{
			counter++;
		}
		
		Object data;
		Node next;
		
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
//	Object data;
//	private static class ListIterator implements Iterator {
//	private Node nextElement;
//	public ListIterator(Node first) {
//	nextElement = first;
//	}
//	@Override
//	public boolean hasNext() {
//	return nextElement != null;
//	}
//	
	
	Node first;
	Node next;
	Node last;
	private Node nextElement;	
	
	@Override
	public void add(Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if(last != null) {
			last.next = node;
		}
			last = node;
	}
	
	public Node first() {
		return first;
	}
	
	
	@Override
	public Iterator iterator() {
		nextElement = first;
		return this;
	}
	
	@Override
	public boolean hasNext() {
		return nextElement != null;
	}
	
	@Override
	public Object next() {
		Object data = nextElement.data;
		nextElement = nextElement.next;
		return data;
	}
	
	@Override
	public void remove() {
	}

	public static void main(String[] args) {
		
		SimpleList list = new MyList2();
		list.add("one");
		list.add("two");
		list.add("three");
		
//		Node current = ((MyList2) list).first(); // traverse - проход по элементам 
//		while (current != null) {
//			System.out.println(current.data);
//			current = current.next;
//		}
//		
		for (current = ((MyList2) list).first(); current != null; current = current.next) {
			System.out.println(current.data);
		}
		for (Object object : list) {
			System.out.println(object);			
		}
		
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	
}
