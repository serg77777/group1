package lesson140401.localinner;

public class UseI {

	public static void main(String[] args) {
		X[] arrayOfX = new X[] {new A(), new C()};	
		useImplementator(arrayOfX);
	}
	
	private static void useImplementator(X[] arrayOfX) {
		for (X x : arrayOfX) {
			x.getI().doIt();
		}
	}

}
