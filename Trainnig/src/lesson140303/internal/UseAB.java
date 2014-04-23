package lesson140303.internal;

import lesson140303.A;
import lesson140303.ComplexState;
import lesson140303.Counter;

//import lesson140303.B;

public class UseAB {

	public static void main(String[] args) {

		A a = new A(20);
		a.printState();
		lesson140303.B b = new lesson140303.B();
		System.out.println(b);
		ComplexState cs = new ComplexState();
		cs.state1 = 10;
		cs.state2 = 20;

		Counter counter = new Counter();
		// counter.increase();
		// counter.count++;
		// System.out.println("Counter state changed");
		// counter.count++;
		// System.out.println("Counter state changed");
		//
		// System.out.println(counter.count);
		// System.out.println("Counter state requested");

		counter.increase();
		counter.increase();
		System.out.println(counter.get());
	}
}
