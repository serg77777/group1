package lesson140304.internal;

import java.util.LinkedList;

import lesson140304.A;
import lesson140304.ComplexState;
import lesson140304.Count;
import lesson140304.D;

public class UseAB {
	
	public static void main(String[] args) {
//		lesson140304.A a = new lesson140304.A();
		A a = new  A();
//		B b;
		a.doIt();
		
		ComplexState cs = new ComplexState();
		
		cs.state2 = 100;
		
		Count counter = new Count();
		counter.count++;
		System.out.println("write to log current count " + counter.count);
		counter.count++;
		System.out.println("write to log current count " + counter.count);
		counter.count++;
		System.out.println("write to log current count " + counter.count);
		System.out.println(counter.count);

		counter.count++;
		System.out.println("write to log current count " + counter.count);
		counter.count++;
		System.out.println("write to log current count " + counter.count);
		counter.count++;
		System.out.println("write to log current count " + counter.count);
		
		System.out.println(counter.count);

		counter.inc();
		counter.inc();
		counter.inc();
		counter.inc();

		counter.get();
		counter.get();
		counter.get();
		counter.get();

		LinkedList<String> list = new LinkedList<String>();
	
		System.out.println(D.count);
		new D();
		D.report();
	}
}
