package homework140407.myqueue;

public class MyQueue {

	Object[] items;
	int queueCurrentSize = 0;
	
	public MyQueue(int maxSize) {
		items = new Object[maxSize];
	}
	
	public int size() {
		return queueCurrentSize;
	}

	public boolean isEmpty() {
		return queueCurrentSize == 0;
	}
	
	public Object viewHead(){
		if(isEmpty()) {
			return null;
		}
		return items[0];
	}
	
	public Object extractHead() throws MyQueueIsEmptyException {
		if(isEmpty()) {
			throw new MyQueueIsEmptyException();
		}
		Object objectToReturn = items[0];
		for (int i = 0; i < queueCurrentSize-1; i++) {
			items[i] = items[i+1];
		}
		queueCurrentSize--;
		items[queueCurrentSize]=null;
		return objectToReturn;
	}
	
	public void add(Object toAdd) throws MyQueueOverflowException {
		if (queueCurrentSize == items.length){
			throw new MyQueueOverflowException();
		}
		items[queueCurrentSize]=toAdd;
		queueCurrentSize++;
	}

}
