package lesson140402.exceptions;

public class Stack {
	Object[] items;
	int tos; // Top Of Stack

	public Stack(int maxSize) {
		items = new Object[maxSize];
		tos = -1;
	}

	public void push(Object object) throws MyStackOverflowException {
		if (tos + 1 == items.length) {
			throw new MyStackOverflowException(items.length, tos);
		}
		tos++;
		items[tos] = object;
	}

	public Object pop() throws StackIsEmptyException {
		if (isEmpty()) {
			throw new StackIsEmptyException();
		}
		Object result = items[tos];
		items[tos] = null;
		tos--;
		return result;
	}

	public Object top() throws StackIsEmptyException {
		if (isEmpty()) {
			throw new StackIsEmptyException();
		}
		return items[tos];
	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
}
