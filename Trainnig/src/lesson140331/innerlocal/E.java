package lesson140331.innerlocal;

public class E implements X {

	int state = 30;

	@Override
	public I getImplementorOfI() {

		class LocalImplementor implements I {

			@Override
			public void doIt() {

				System.out.println("I did it locally, state " + state);

			}

		}
		return new LocalImplementor();
	}
}
