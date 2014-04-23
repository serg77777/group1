package lesson140319;

import java.util.ArrayList;

public class Stack extends ArrayList<Object> {
	public void push(Object item) {
		super.add(item);
	}

	public Object pop() {
		if (isEmpty()) {
			return null;
		}
		return super.remove(size() - 1);
	}

	public Object top() {
		return super.get(super.size() - 1);
	}

	@Override
	public Object remove(int index) {
		throw new UnsupportedOperationException();
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("one");
		stack.push("two");
		stack.push("three");

		stack.remove(0);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}
