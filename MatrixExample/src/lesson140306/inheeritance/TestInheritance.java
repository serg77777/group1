package lesson140306.inheeritance;

import lesson140306.D;


public class TestInheritance {
	
	public static void main(String[] args) {
		A a = new A(10);
		System.out.println(a.getState());
		a.changeState();
		System.out.println(a.getState());
		
		  B b = new B();
		  b.printState();
		  b.setState(40);
		  b.printState(); 
		  b.printState(); 
		  
		  D d = new D();
		  d.printState();
//		  d.changeState(); Error with visible
	}
}
