package lesson140326.inner;

import lesson140326.inner.B.Bi;
import lesson140326.inner.D.Di;

public class InnerExample {

	public static void main(String[] args) {
		B b = new B();
		Bi bi = b.new Bi();
		bi.printState();
		
		B b2 = new B();
		//b2.printMyState();
		
		C c = new C();
		Ci ci = new Ci(c);
		
		
		D d = new D();
		Di di = new D.Di(d);
		
	}

}
