package lesson140331.innerlocal;

public class B implements X {

	@Override
	public I getImplementorOfI() {

		return new ImplementorOfI();
	}
}
