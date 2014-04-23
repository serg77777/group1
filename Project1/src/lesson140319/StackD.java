package lesson140319;

import java.util.ArrayList;

public class StackD {

	private final ArrayList list = new ArrayList();
	
	public Object pop() {
		if (list.isEmpty()) {
			return null;
		}
		return list.remove(list.size() - 1);
	}
	
	public void push( Object item) {
		list.add(item);
	}
	
	public Object top() {
		if (list.isEmpty()) {
			return null;
		}
		return list.get(list.size() - 1);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
}
