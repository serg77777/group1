package lesson140331.innerlocal;

public class A implements I, X {

	@Override
	public void doIt() {
		System.out.println("did it");
	}

	public I getImplementorOfI() {
		return this;
	}
}
