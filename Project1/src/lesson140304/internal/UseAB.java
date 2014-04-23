
package lesson140304.internal;

import java.util.LinkedList;

import lesson140304.A;
import lesson140304.ComplexState;
import lesson140304.Counter;
import lesson140304.D;

public class UseAB {
public static void main(String[] args) {
//	lesson140304.A a = new lesson140304.A();
	A a = new A();
	a.doIt();
	
	ComplexState cs = new ComplexState();
	cs.state2 = 100;
	
	Counter counter = new Counter(); 
	
	counter.inc();
//	System.out.println("urrent to log counter count" + counter.get());
	counter.inc();
	counter.get();
	counter.inc();
//	System.out.println(counter.count);
	
	LinkedList<String> list = new LinkedList<String>();
	
	System.out.println(D.count);
	
	new D();
	D.report();
	
}
}
