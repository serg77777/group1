package home.work;

import java.util.ArrayList;

public class MyOwnStack<T> extends ArrayList<T> {

	public void push(T ob) {
		super.add(ob);
	}

	public T pop() {
		if (super.isEmpty()) {
			return null;
		}
		return super.remove(super.size() - 1);
	}

	

	public T top() {
		return super.get(super.size() - 1);
	}

}
