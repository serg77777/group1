package lesson140401.localinner;

public class UseI {

	public static void main(String[] args) {
	
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		F f = new F();
	
	
		
		X[] arrayOfX = new X[] {a,b,c,d,e,f};
		makeThemDoIt(arrayOfX);
		
			}

	
	private static void makeThemDoIt(X[] arrayOfX) {

		for (X x : arrayOfX) {
			x.getI().doIt();
		}
	}
	
}
