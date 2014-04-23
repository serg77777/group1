package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {

	
	//1. QueueOverflow

	public static class QueueOverflow extends Exception {

		private Object _item;

		public QueueOverflow(Object item) {
			_item = item;
		}
		
		public Object getItem(){
			return _item;
		}
	}


	public static class QueueUnderflow extends Exception {

	
		
	}


	private int _maxsize;

	int count;
	
	public Queue(int maxsize){
		_maxsize = maxsize;
	}

	public void put(Object item) throws QueueOverflow{
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
	
	public Object take() throws QueueUnderflow{
		if (first == null) {
			throw new QueueUnderflow();
			}
		
		Node elem = first;
		first = elem.next; 
		count--;
		return elem.data;
	
		
		//return null;
	}
	
	public Object head() {
		return first == null? null : first.data;
	}
	
	public Object tail() throws QueueUnderflow{
		if (last == null) {
			throw new QueueUnderflow();
		}
		
		return last.data;
		
	}
	
	public boolean isEmpty(){
		return first == null;
	}

	public int size() {
		return count;
	}
	
	
	public static void main(String[] args) throws QueueOverflow {
		
		Queue queue = new Queue(15);
	//	queue.head();
		try {
			queue.put("one");
			queue.put("two");
			queue.put("three");
			queue.put("four");
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
			
		} catch (QueueUnderflow e) {
			System.out.println("Пустая очередь " );
		}
	}
	
	
	
}
