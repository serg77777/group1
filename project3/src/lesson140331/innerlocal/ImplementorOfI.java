package lesson140331.innerlocal;

public class ImplementorOfI implements I, X {

	@Override
	public void doIt() {
		System.out.println("I did it too!");
	}

	@Override
	public X getImplementorOfI() {
		// TODO Auto-generated method stub
		return null;
	}


}
