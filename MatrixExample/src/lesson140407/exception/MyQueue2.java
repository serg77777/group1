package lesson140407.exception;

import java.util.ArrayList;

import lesson140407.exception.MyQueue.QueueOverflowException;

public class MyQueue2 extends ArrayList{

	public static class QueueUnderflowException extends RuntimeException {

	}

	public static class QueueOverflowException extends RuntimeException {
		
	}
	
	private final int _maxsize;
	private int _count = 0;

	public MyQueue2 (int maxsize) {
		_maxsize = maxsize;
	}
	
	public Object next() {
		return null;
	}
	public void put(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxsize) {
			throw new QueueOverflowException();
		}
		super.add(item);
//		_count++;
	}
	public Object take() {
		Object result = head();
		if (result == null) {
			return new QueueOverflowException();
		} else {
//			first = first.getNext();
			_count--;
			return result;
		}
	}
	
	public Object head() {
		if (isEmpty()) {
			return new QueueUnderflowException();
		}
		return first.getData();
	}
	
	public Object tail() {
		if (isEmpty()) {
			return new QueueUnderflowException();
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

}
