package lesson140327.inner;

import lesson140327.inner.S.Si;

public class UseInners {

	public static void main(String[] args) {
		 S s = new S();
		 Si si = new Si();
		 s.print();
		 
		 A a = new A();
		 A.Ai ai = a.new A.Ai();
		 
		 B b = new B();
		 Bi bi = new Bi(b);
		 
	}
}
