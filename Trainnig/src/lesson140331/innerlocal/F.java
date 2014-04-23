package lesson140331.innerlocal;

public class F implements X {

	int state = 50;

	@Override
	public I getImplementorOfI() {

		return new FImplementorOfI(this);
	}
}
