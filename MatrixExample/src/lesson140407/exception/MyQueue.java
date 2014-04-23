package lesson140407.exception;


import lesson140331.innerlocal.MyList;

public class MyQueue extends MyList {
	
	public static class QueueUnderflowException extends RuntimeException {

	}

	public static class QueueOverflowException extends RuntimeException {
		
	}

	private final int _maxsize;
	private int _count = 0;

	public MyQueue (int maxsize) {
		_maxsize = maxsize;
		
	}
	
	public void put(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxsize) {
			throw new QueueOverflowException();
		}
		add(item);
		_count++;
	}
	public Object take() {
		// получить первый элемент
		// если он пустой, вернуть налл
		// иначе  сделать первым следующй за ним
		// вернуть данные, кооторые были в старом первом
		Object result = head();
		if (result == null) {
			return new QueueOverflowException();
		} else {
			first = first.getNext();
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
