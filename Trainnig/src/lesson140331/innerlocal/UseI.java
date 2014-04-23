package lesson140331.innerlocal;

public class UseI {

	public static void main(String[] args) {

		X[] arrayOfX = new X[] { new A(), new B(), new C(), new D(), new E(),
				new F() };
		useImplementor(arrayOfX);
	}

	private static void useImplementor(X[] arrayOfX) {

		for (X x : arrayOfX) {
			x.getImplementorOfI().doIt();
		}

	}
}
