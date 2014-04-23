package lesson140401.localinner;

public class UseI {

	public static void main(String[] args) {
		ImplementorOfI[] arrayOfX = new ImplementorOfI[]{
				new A(), new B(), new C(), new D(), new F(), new G()
		};
		
		useImpl(arrayOfX);
	}

	private static void useImpl(ImplementorOfI[] arrayOfX) {
		for(ImplementorOfI imp : arrayOfX){
			imp.getImplementationOfI().doIt();
		}
		
	}

}
