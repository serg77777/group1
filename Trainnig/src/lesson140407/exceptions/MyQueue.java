package lesson140407.exceptions;

public class MyQueue {

	public static class QueueOverflowException extends RuntimeException {

	}

	Object[] _items;

	private final int _maxSize;
	private int _currentSize;

	public MyQueue(int maxSize) {

		_items = new Object[maxSize];
		_maxSize = maxSize;
	}

	public void put(Object object) {

		if (object == null) {
			throw new IllegalArgumentException();
		}
		if (size() == _maxSize) {
			throw new QueueOverflowException();
		}
		_items[_currentSize] = object;
		_currentSize++;
	}

	public Object take() {

		Object result = head();
		_currentSize--;
		for (int i = 0; i < _currentSize; i++) {
			_items[i] = _items[i + 1];
		}
		return result;
	}

	public Object head() {

		if (isEmpty()) {
			throw new NullPointerException();
		}
		return _items[0];
	}

	public Object tail() {

		if (isEmpty()) {
			throw new NullPointerException();
		}
		return _items[_currentSize];
	}

	public boolean isEmpty() {

		return _currentSize == 0;
	}

	public int size() {

		return _currentSize;
	}

	public static void main(String[] args) {

		MyQueue queue = new MyQueue(5);
		queue.put("one");
		queue.put("two");
		queue.put("three");
		queue.put("four");
		queue.put("five");
		// queue.put("six");

		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());

		queue.put("six");
		queue.put("seven");
		queue.put("eight");

		queue.take();
		queue.take();

		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
	}
}
