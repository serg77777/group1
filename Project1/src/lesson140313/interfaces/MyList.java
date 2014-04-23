package lesson140313.interfaces;

import java.util.Iterator;

class Node {

	public Object data;
	Node next;

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

}


public class MyList implements SimpleList {

	
	Node first;
	Node last;

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyListIterator(first);
	}

	public void add(Object data) {
		Node node = new Node(data, null);
		if (last != null) {
			last.next = node;
		} else {
			first = node;
		}
		last = node;
	}

	public static void main(String[] args) {
		SimpleList list = new MyList();
		
		list.add("one");
		list.add(2);
		list.add(345);
		
		Iterator it = list.iterator();
		System.out.println(list.first().data);
		while(it.hasNext()){
			Node n = (Node)it.next();
			System.out.println(n.data);
		}
		
	}

	@Override
	public Node first() {
		// TODO Auto-generated method stub
		return first;
	}

}
