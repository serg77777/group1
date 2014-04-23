package internal1;

import lesson140303.A1;
import lesson140303.ComplexState;
import lesson140303.Counter;

public class UseAB {
	public static void main(String[] args) {
		A1 a = new A1(20);
		
		ComplexState cs = new ComplexState();
		cs.state1 = 10;
		cs.state2 = 20;
		
		Counter counter = new Counter();
		//counter.inc();
		counter.count++;
		counter.count++;
		
		System.out.println(counter.count);
	}
}
