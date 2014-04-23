package lesson140313.interfaces;

import java.util.Iterator;

public class MyList1 implements SimpleList{

	public static class Node {

		Object data;
		Node next;
		
		public Node(Object data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}		
	}

//	private static class ListIterrator implements Iterator{
//		
//		public ListIterrator(Node first){
//			nextElement = first;
//		}
//		
//		private Node nextElement;
//		@Override
//		public boolean hasNext() {
//			return nextElement != null;
//		}
//
//		@Override
//		public void remove() {
//		}
//
//		@Override
//		public Object next() {
//			Object data = nextElement.data;
//			nextElement = nextElement.next;
//			return data;
//
//		}
//	}
	
	private Node first;
	private Node last;


//	@Override
//	public Iterator iterator() {
//		return new ListIterrator(first);
//	}
	
	@Override
	public Iterator iterator() {
		
		return new MyIterator(first);
	}

	
   

	@Override
	public void add(Object data) {
		Node node = new Node(data, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}

		last = node;
	}

	public static void main(String[] args) {

		SimpleList list = new MyList1();

		list.add("one");
		list.add("two");
		list.add("three");

//		Node current = list.first();
//		while (current != null) {
//			System.out.println(current.data);
//			current = current.next;
//		}
//
		for (Object object : list) { //variant s iteratorom
			System.out.println(object);
		}
		
//		Iterator it = list.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
