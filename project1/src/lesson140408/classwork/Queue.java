package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {

	public static class QueueOverflow extends Exception {

		private Object _item;

		public QueueOverflow(Object item) {

			_item = item;

		}

		public Object getItem() {

			return _item;
		}

	}

	public static class QueueUnderflow extends Exception {

	}

	private int _maxsize;
	int count;

	public Queue(int maxsize) {

		_maxsize = maxsize;
	}

	public void put(Object item) throws QueueOverflow {

		if (count == _maxsize) {
			throw new QueueOverflow(item);
		}
		super.add(item);
		count++;
	}

	@Override
	public void add(Object item) {

		throw new UnsupportedOperationException();
	}

	public Object take() throws QueueUnderflow {

		if (first == null) {
			System.out.println("queue is empty");
			throw new QueueUnderflow();
		}
		Node node = first;
		first = first.next;
		count--;
		return node.data;
	}

	public Object head() throws QueueUnderflow {

		if (first == null) {
			throw new QueueUnderflow();
		}
		return first.data;

	}

	public Object tail() throws QueueUnderflow {

		if (last == null) {
			throw new QueueUnderflow();
		}
		return last.data;
	}

	public boolean isEmpty() {

		return first == null;
	}

	public int size() {

		return count;
	}

	public static void main(String[] args) throws QueueUnderflow {

		Queue queue = new Queue(1);
		// queue.add("one");
		try {
			queue.put("One");
			System.out.println(queue.head());
			queue.put("Two");
		} catch (QueueOverflow e) {
			System.out.println("queue is full, can't put " + e.getItem());
		}
	}
}
