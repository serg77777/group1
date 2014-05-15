package homework.genericStack;

import lesson140402.exceptions.StackIsEmptyException;

public class GenericStack<T> {

	private T[] _items;
	private int _tos;

	public GenericStack(int maxSize) {

		_items = (T[]) new Object[maxSize];
		_tos = -1;
	}

	public void push(T object) throws StackOverflowError {

		if (size() == _items.length) {
			throw new StackOverflowError();
		}
		_tos++;
		_items[_tos] = object;
	}

	public T top() throws StackIsEmptyException {

		if (isEmpty())
			throw new StackIsEmptyException();
		return _items[_tos];
	}

	public T pop() {

		T result = null;
		try {
			result = top();
		} catch (StackIsEmptyException e) {
			e.printStackTrace();
		}
		_items[_tos] = null;
		_tos--;
		return result;
	}

	private boolean isEmpty() {

		return size() == 0;
	}

	private int size() {

		return _tos + 1;
	}

	public static void main(String[] args) {

		GenericStack<Integer> igs = new GenericStack<>(5);
		GenericStack<String> sgs = new GenericStack<>(5);
		igs.push(new Integer(5));
		igs.push(3);
		System.out.println(igs.pop());
		System.out.println(igs.pop());
		sgs.push("hi");
		sgs.push("bye");
		System.out.println(sgs.pop());
		System.out.println(sgs.pop());
	}
}
