package lesson140514.generics;

public class ErasureExtends {

	static class Node<T extends Comparable<T>> {

		private T _data;
		private Node<T> _next;

		public T getData() {

			return _data;
		}

		public void setData(T data) {

			_data = data;
		}

		public Node<T> getNext() {

			return _next;
		}

		public void setNext(Node<T> next) {

			_next = next;
		}

		public Node(T data, Node<T> next) {

			super();
			_data = data;
			_next = next;
		}
	}

	static class Node2 {

		private Comparable _data;
		private Node2 _next;

		public Comparable getData() {

			return _data;
		}

		public void setData(Comparable data) {

			_data = data;
		}

		public Node2 getNext() {

			return _next;
		}

		public void setNext(Node2 next) {

			_next = next;
		}

		public Node2(Comparable data, Node2 next) {

			super();
			_data = data;
			_next = next;
		}
	}
}
