package lesson140512.generics;

public class MyList<T> {

	private static class Node<T> {

		T _item;
		Node<T> _next;

		public Node(T item, Node<T> next) {

			super();
			_item = item;
			_next = next;
		}
	}

	Node<T> first;
	Node<T> last;

	public void add(T item) {

		Node<T> node = new Node<T>(item, null);
		if (last != null) {
			last._next = node;
		}
		last = node;
		if (first == null) {
			first = node;
		}
	}

	public T first() {

		return first._item;
	}

	public static void main(String[] args) {

		MyList<String> list = new MyList<>();
		list.add("hello");
		// list.add(25);
		// Integer i = (Integer) list.first();
		String s = list.first();
		System.out.println(s);
	}
}
