package lesson140331.innerlocal;

public class UseI implements X{
	public static void main(String[] args) {

		A a = new A();
		C c = new C();
		
		X[] arrayOfX = new X[] {a,c};
		makeThemDoIt(arrayOfX);	
		
	}
	
	private static void makeThemDoIt(X[] arrayOfX) {
		for (X newarray: arrayOfX) {
			newarray.getI().doIt();
		}
	}

	
	}

	

