package lesson140407.exceptions;

import javax.naming.SizeLimitExceededException;

import lesson140331.MyList;

public class MyQueue extends MyList {
	private final int _maxsize;
	private int _count;
	private Object _first;

	public static class QueueOverflowEceptoin extends RuntimeException {

	}

	public MyQueue(int maxsize) {
		_maxsize = maxsize;

	}

	public void put(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxsize) {
			throw new QueueOverflowEceptoin();
		}

		add(item);
		_count++;
	}

	public Object take() {
		// get first item
		// if isEmpty return null
		// else
		// make next is first
		// return item, which was first
		if (first == null) {
			return null;
		} else {
			Node old;
			old = first;
			first = getNext();

			_count--;
		}

	}

	public Object head() {
		if (isEmptu()) {
			return null;
		}
		return first.getData();
	}

	public Object tail() {
		if (isEmptu()) {
			return null;
		}
		return last.getData();
	}

	public boolean isEmptu() {
		return _count == 0;
	}

	public int size() {
		return _count;
	}

}
