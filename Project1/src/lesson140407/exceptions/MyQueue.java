package lesson140407.exceptions;

import javax.naming.SizeLimitExceededException;

import lesson140331.MyList;

public class MyQueue extends MyList {

	public  class QueueOverflowException extends RuntimeException {
		
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
		if ( size() == _maxsize ) {
			throw new QueueOverflowException();
		}
		add(item);
		_count++;
	}
	public Object take() {
		if (first == null) {
			//return null;
			throw new NullPointerException(); 
		}
		Object aFirst = head();
		first = first.getNext();
		_count = _count - 1;
		return aFirst;
	}
	public Object head() {
		if (isEmpty()) {
			//return null;
			throw new NullPointerException(); 
		}
		return first.getData();
	}
	public Object tail() {
		if (isEmpty()) {
			//return null;
			throw new NullPointerException(); 
		}
		return last.getData();
	}
	public boolean isEmpty() {
		return (_count == 0);
	}
	public int size() {
		return _count;
	}
}
