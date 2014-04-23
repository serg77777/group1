package lesson140304;

public class A {
	
	public A() {

	}
	
	
	B b = new B();
	
	// public  (application level)
	// protected (descendants level)
	// (default) (package level)
	//  private (class level)
	
	// visibility
	
	
	public void doIt() {		
		b.doIt();		
	}
}
