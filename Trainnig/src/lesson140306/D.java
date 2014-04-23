package lesson140306;

import lesson140306.protect.C;

public class D extends C {
	public void printSate() {
		System.out.println(_state);
	}

	public static void main(String[] args) {
		D d = new D();
		d.printSate();
		d.changeState();
	}
}
