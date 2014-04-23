package lesson140331.innerlocal;

import lesson140331.innerlocal.A;
import lesson140331.innerlocal.B;
import lesson140331.innerlocal.C;
import lesson140331.innerlocal.D;

public class UseI {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		F f = new F();
		
		a.getI().doIt();
		b.getI().doIt();
		c.getI().doIt();
		d.getI().doIt();
		e.getI().doIt();
		f.getI().doIt();
		
		
	}

}
