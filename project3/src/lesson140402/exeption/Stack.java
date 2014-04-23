package lesson140402.exeption;


public class Stack {
	
	Object[] items;
	int tos = -1; // top of stack
	
	public Stack(int maxSize){
		items = new Object[maxSize];
	}
	
	public void push(Object object) throws MyStackOverflowExeption {
		if (tos+1 == items.length) {
			throw new MyStackOverflowExeption(items.length, tos);
		}
		tos++;
		items[tos] = object;
	}
	public Object pop() throws StackIsEmptyExeption {
		if(isEmpty()) {
			throw new StackIsEmptyExeption();
		}
		Object result = items[tos];
		items[tos] = null;
		tos--;
		return result;
	}
	public Object top() throws StackIsEmptyExeption {
		if(isEmpty()) {
			throw new StackIsEmptyExeption();
		}
		return items[tos];
	}
	public int size() {
		return tos +1;
	}
	public boolean isEmpty() {
		return tos == -1;
	}
	
	

}
