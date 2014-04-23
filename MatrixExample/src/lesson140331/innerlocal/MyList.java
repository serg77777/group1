package lesson140331.innerlocal;

import java.util.ArrayList;
import java.util.Iterator;

public class MyList implements SimpleList {

	protected static class ListIterator implements Iterator {
		Node next;
		
		public ListIterator(Node first) {
			next = first;
		}
		
		@Override
		public boolean hasNext() {
			return next != null;
		}
		
		@Override
		public Object next() {
			Object result = next.getData();
			next = next.getNext();
			return result;
		}
		
		@Override
		public void remove() {
		}

	}
	
	public static class Node {
		
		private Object data;
		private Node next;

		public Node(Object data, Node next) {
			super();
			this.setData(data);
			this.setNext(next);
		}

		public Object getData() {
			return data;
		}

		public void setData(Object data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}

	protected Node last;
	protected Node first;

	@Override
	public void add(Object element) {
		Node node = new Node(element, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.setNext(node);
		}
		last = node;
	}
	
	@Override
	public Iterator iterator() {
		return  new Iterator() {
			Node next;
			
			public void ListIterator(Node first) {
				next = first;
			}
			
			@Override
			public boolean hasNext() {
				return next != null;
			}
			
			@Override
			public Object next() {
				Object result = next.getData();
				next = next.getNext();
				return result;
			}
			
			@Override
			public void remove() {
			}
		};
	}
	public static void main(String[] args) {

		SimpleList list = new MyList();
		list.add("one");
		list.add("two");
		list.add("three");

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

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(String element) {
		// TODO Auto-generated method stub
		
	}

}
