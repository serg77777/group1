package lesson140313.interfaces;

import java.util.Iterator;

import lesson140313.interfaces.MyList1.Node;

public class MyIterator implements Iterator {

	private Node nextElement;

	public MyIterator(Node first) {
		nextElement = first;
	}

	@Override
	public boolean hasNext() {
		return nextElement != null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object next() {
		Object data = nextElement.data;
		nextElement = nextElement.next;
		return data;
	}
}
