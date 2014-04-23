package lesson140402.exception;

import java.util.Arrays;

public class Stack {

	private Object[] items;
	private int tos = -1; //Top Of Stack	
	
	public Stack(int maxsize){
		items = new Object[maxsize];
	}
	
	public void push(Object obj) throws MyStackOverflowException{
		if(tos +1 == items.length){
			throw new MyStackOverflowException("Stack overflow....",tos,items.length);
		}
		tos++;
		items[tos] = obj;
	}
	
	public Object pop() throws StackIsEmptyException{
		if(tos == -1){
			throw new StackIsEmptyException();
		}
		Object res = items[tos];
		items[tos] = null;
		tos--;
		return res;
	}
	
	public Object top() throws StackIsEmptyException{
		if(isEmpty()){
			throw new StackIsEmptyException();
		}
		return items[tos];
	}
	
	public int size(){
		return tos + 1;
	}
	
	public boolean isEmpty(){
		return tos < 0;
	}
}
