package lesson140408.classwork;

import lesson140408.Exception.List;

public class Queue extends List {
	
	// 1. QueueOverflow for head

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
	
	public Queue (int maxsize) {
		_maxsize = maxsize; 
	}
	
	private int _maxsize;
	int count;					//очередь

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
	
	public Object take() throws QueueUnderflow {		 	// взять объект
		Node element = first; 			// взять первый элемент
		if (element == null) { 			// если пустой, то 
			throw new QueueUnderflow(); // exception
		} 
		first = element.next; 			// иначе сделать первым следующий элемент
		count--; 						// т.к берем элемент из очереди, необходимо уменишь размер очереди
		return element.data; 			// вернуть данные из бывшего первого элемента
	}
	
	public Object head() throws QueueUnderflow {  	 		// что в начале очереди
		if (first == null) {
			throw new QueueUnderflow();
		}
		return first.data;
//				first == null? null :first.data;
	}
	
	public Object tail() throws QueueUnderflow {  	 		// что в конце очереди
		if (last == null) {
			throw new QueueUnderflow();
		}
		return last.data;
	}
	
	public boolean isEmpty() { 								// пустая ли очередь
		return first == null;
	}
	
	public int size() { 									// размер очереди
		return count;
	}
	
	public static void main(String[] args) throws QueueUnderflow {
		Queue queue = new Queue(10);
//		queue.head();
		try {
			queue.put("one");
			queue.put("two");
			queue.put("three");
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (QueueOverflow e) {
			System.out.println("Queue is full, can't put " + e.getItem());
		}
//		queue.take\("one");
		
		
	}
	
}
