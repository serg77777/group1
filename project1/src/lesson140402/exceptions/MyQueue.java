package lesson140402.exceptions;

import lesson140331.innerlocal.MyList;

public class MyQueue extends MyList {

	public class QueueUnderFlowException extends Exception {

	}

	public class QueueOverFlowException extends RuntimeException {

	}

	private final int _maxsize;
	private int _count = 0;

	public MyQueue(int maxsize) {

		_maxsize = maxsize;
	}

	public void put(Object item) {

		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxsize) {
			throw new QueueOverFlowException();
		}
		add(item);
		_count++;
	}

	public Object take() throws QueueUnderFlowException {

		if (isEmpty()) {
			throw new QueueUnderFlowException();
		}

		_count--;

		return first.getData();

	}

	public Object head() {

		if (isEmpty()) {
			return null;
		}
		return first.getData();
	}

	public Object tail() {

		if (isEmpty()) {
			return null;
		}
		return last.getData();

	}

	public boolean isEmpty() {

		return _count == 0;
	}

	public int size() {

		return _count;
	}
}
