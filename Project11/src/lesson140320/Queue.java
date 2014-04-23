package lesson140320;

import java.util.LinkedList;

public class Queue extends LinkedList { //nasledovanie s ogranicheniem

	@Override
	public void addFirst(Object e) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object pollLast() {
		throw new UnsupportedOperationException();
	}
}
