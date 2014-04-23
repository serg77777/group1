package lesson140331.innerlocal;

public class UseI {
	public static void main(String[] args) {
//		new A().getImplementorOfI();
//		new B().getImplementorOfI();
//		new C().getImplementorOfI();
//		new D().getImplementorOfI();
//		new E().getImplementorOfI();
//		new F().getImplementorOfI();
		
		X[] arrayOfX = new X[] {new A(), new B(), new C(), new D(), new F()};
		
		useUmplementor(arrayOfX);
	}
	
	private static void useUmplementor(X[] arrayOfX) {
		for (X x : arrayOfX) {
			x.getImplementorOfI().doIt();
		}
	}
}
