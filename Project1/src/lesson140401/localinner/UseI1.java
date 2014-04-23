package lesson140401.localinner;

public class UseI1 {

	public class X implements ImplementorOfI
	
	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		F f = new F();
		G g= new G();
		
		a.getImplementationOfI().doIt();
		b.getImplementationOfI().doIt();
		c.getImplementationOfI().doIt();
		d.getImplementationOfI().doIt();
		f.getImplementationOfI().doIt();
		g.getImplementationOfI().doIt();
		
		
		X[] arrayOfX = new X[] {a,c};
	}
	
	public static void makeThemDoIt(X[] arrayOfX) {
		for (X x:arrayOfX) {
			x.getI().doIt();
		}
	}
}
