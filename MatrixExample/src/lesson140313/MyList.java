package lesson140313;

public class MyList implements SimpleList {

	Node first;
	Node last;
	
	@Override
	public Node first() {
		return first;
	}
	@Override
	public void add(Object data) {
		Node node = new Node(data, null);
		if (first == null) {
			first = node;
		}
		if (last != null) {
			last.next = node;
		}
		
		last = node;
	}
	
	public static void main(String[] args) {
		SimpleList list = new MyList();
		
		list.add("one");
		list.add(1);
		list.add("three");
		
		Node current = list.first();
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	
}
