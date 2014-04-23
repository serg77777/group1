package lesson140331.innerlocal;

public class A implements I, X {

	@Override
	public I getImplementorOfI() {

		return this;
	}

	@Override
	public void doIt() {

		System.out.println("I did it");
	}
}
