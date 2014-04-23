package lesson140402.exeption;

import lesson140331.innerlocal.MyList;

public class MyQueue  extends MyList{
	
	
	public static class QueueOverflowException extends RuntimeException {
		
	}
	
	private final int _maxsize;
	private int _count;
	
	public MyQueue(int maxsize) {
		_maxsize = maxsize;
	}
	
	public void put(Object item) {
		if (item == null) {
			throw new IllegalArgumentException();
		}
		if(size() == _maxsize) {
			throw new QueueOverflowException();
		}
		add(item);
		_count++;
	}
	
	public Object take() {
		
		//получить первый элемент
		if( first  == null) {
			return null;
		}else {
			Node old = first;
			first = first.getNext();
			_count--;
			return old.getData();
			
		}
		
		// если он пустой вернуть null
		//иначе
		// сделать первый следующий за ним 
		// вернуть данный которые были в старом

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
		return _count  == 0;
	}
	public int  size() {
		return _count;
	}
	
}
