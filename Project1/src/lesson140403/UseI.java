package lesson140403;


public class UseI {

	
	public static void main(String[] args) {
		
		A a = new A();
		
		C c = new C();
		
		
		
		X[] arrayOfX = new X[] {a,c};
	}
	
	public static void makeThemDoIt(X[] arrayOfX) {
		for (X x:arrayOfX) {
			x.getI().doIt();
		}
	}
}
