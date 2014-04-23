package Lesson140304.internal;

import Lesson140304.A;
import Lesson140304.ComplexState;

public class UseAB {
	
	public static void main(String[] args) {
		A a = new A();
		a.doIt();
		
		ComplexState cs = new ComplexState();
		cs.state2 = 100;
		
		
		Count count = new Count();
		count.count++;
		count.count++;
		count.count++;
		count.getCount();
		System.out.println(count.count);
		
		
		
		
	}
}
