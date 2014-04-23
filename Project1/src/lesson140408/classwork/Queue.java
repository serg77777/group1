package lesson140408.classwork;

import lesson140408.exceptions.List;

public class Queue extends List {

	public static class QueueOverflow extends Exception {

		private Object _item;

		public QueueOverflow(Object item) {
			_item = item;
			// TODO Auto-generated constructor stub
		}

		public Object getItem() {
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
		if (count == _maxsize){
			throw new QueueOverflow(item);
		}
		
		super.add(item);
		count++;
	}
	
@Override
public void add(Object item){
		throw new UnsupportedOperationException();
}

// take first
//if null then exception
//else
//two become first
//count --
//return first
public Object take() throws QueueUnderflow  {

	Object FirstData = head();
	first = first.next;
	count --;
	return FirstData;
		
	
	}
	
//	public Object head(){
//	    return first == null? null : first.data;	
//	}
	
	public Object head() throws QueueUnderflow{
		if (first == null){
			throw new QueueUnderflow();
		}
		return first.data;
	}
	public Object tail() throws QueueUnderflow{
		if (last == null){
			throw new QueueUnderflow();
		}
		
		
		return last.data;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	public int size() {
		return 0;
	}
	
	
	public static void main(String[] args) throws QueueUnderflow {
		Queue queue = new Queue(5);
		
	try{
		queue.put("one");
		queue.put("two");
		queue.put("three");
		queue.put("four");
		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
		System.out.println(queue.take());
		
	}catch(QueueOverflow e) {
		System.out.println("Queue is full, can't put " + e.getItem());
	}
	}
	
}
