package lesson140401.localinner;

public class UseII {
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		F f = new F();
		
//		a.getI().doIt();
//		b.getI().doIt();
//		c.getI().doIt();
//		d.getI().doIt();
//		e.getI().doIt();
//		f.getI().doIt();
		
		
		X[] arrayOfX = new X[] {a, b, c, d, e, f};
		makeThemDOIt(arrayOfX);
	}
	
	public static void makeThemDOIt(X[] arrayOfX){
		for (X x : arrayOfX) {
			x.getI().doIt();
		}
		
		
	}

}
