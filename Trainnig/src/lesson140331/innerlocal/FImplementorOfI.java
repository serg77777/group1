package lesson140331.innerlocal;

public class FImplementorOfI implements I {

	F _f;

	public FImplementorOfI(F f) {

		_f = f;
	}

	@Override
	public void doIt() {

		System.out.println("I did it externally, state " + _f.state);

	}

}
