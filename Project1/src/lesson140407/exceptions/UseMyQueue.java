package lesson140407.exceptions;

import lesson140407.exceptions.MyQueue.QueueOverflowException;

public class UseMyQueue {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue(3);
	
		queue.put("1");
		queue.put("2");
		queue.put("3");
		
		System.out.println(queue.take());
		System.out.println(queue.take());
		queue.put("2");
		
		System.out.println(queue.take());
		System.out.println(queue.take());
	}
	
}
