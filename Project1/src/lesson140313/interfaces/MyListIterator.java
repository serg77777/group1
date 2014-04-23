package lesson140313.interfaces;

import java.util.Iterator;

public class MyListIterator implements Iterator{
	Node current;

	public MyListIterator(Node first) {
		current = first;
	}
	

	@Override
	public boolean hasNext() {
		return (current.next != null);
	}

	@Override
	public Object next() {
		current = current.next;
		return current;
	}

	@Override
	public void remove() {
	}

}