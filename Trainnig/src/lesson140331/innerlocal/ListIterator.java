package lesson140331.innerlocal;

import java.util.Iterator;

public class ListIterator implements Iterator {

	MyList.Node next;

	public ListIterator(MyList.Node first) {

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

		// TODO Auto-generated method stub

	}
}
