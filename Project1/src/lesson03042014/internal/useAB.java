package lesson03042014.internal;

import java.util.LinkedList;

import lesson03042014.A;
import lesson03042014.ComplexState;
import lesson03042014.Counter;

public class useAB {
	public static void main(String[] args){
//		lesson03042014.A a=new lesson03042014.A();
		A a = new A();
		a.doIt();
		
		ComplexState cs = new ComplexState();
		cs.state2 = 100;
				
		Counter counter = new Counter();
		
		counter.count++;
		System.out.println(counter.count);
		counter.count++;
		counter.count++;
		System.out.println(counter.count);
		counter.count++;
		counter.count++;
		counter.count++;
		System.out.println(counter.count);
		counter.inc();
		
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println("fweg");
		new D();
		D.report();
	}

}
