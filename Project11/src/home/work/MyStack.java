package home.work;

public class MyStack<T> {

	private static class Node<T> {
		T item;
		Node<T> last;

		Node(T item, Node<T> last) {
			this.item = item;
			this.last = last;
		}

	}

	Node<T> present;
	Node<T> pop;

	public void add(T item) {

		if (present == null) {
			Node node = new Node<T>(item, null);
			present = node;

		} else {
			Node node = new Node<T>(item, present);
			present = node;

		}

	}

	public T pop() {
		if (present == null) {

			return null;
		}
		pop = present;
		present = present.last;
		return pop.item;

	}

	// public static void main(String[] args) {
	//
	// MyStack<Integer> ms = new MyStack<>();
	//
	// for (int i = 0; i < 10; i++) {
	// ms.add(i);
	//
	// }
	//
	// ms.pop();
	// ms.pop();
	// ms.pop();
	// ms.pop();
	//
	// }

	public Boolean isEmpty() {
		if (present == null) {
			return false;
		}
		return true;
	}
}
