package lesson140312.intefaces;

import java.util.Iterator;

import lesson140312.intefaces.MyList.Node;

public class ListIterator implements Iterator {

	private  Node nextElement;
	{
		
	}
	
	public ListIterator (Node first) {
		nextElement = first;
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

}
