package lesson140312.interfaces;

public class MyList implements SimpleList, Iterator {

	Node last;

	Node first;
	
	@Override
	public void add(String element) {
		Node newNode = new Node(element, null);
		
		if (first == null){
			first = newNode;
		}
			
		if(last != null) {
			last.next = newNode;
		} 
		last = newNode;
		
	}
	
	@Override
	public Node first() {
		// TODO Auto-generated method stub
		return first;
	}
	public static void main(String[] args) {
		
		SimpleList list = new MyList();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		
		Node current = list.first();
		while (current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}


}
