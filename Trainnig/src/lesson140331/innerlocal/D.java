package lesson140331.innerlocal;

public class D implements X {

	int state = 20;

	class InnerImplementor implements I {

		@Override
		public void doIt() {

			System.out.println("I did it from inside with state " + state);
		}
	}

	@Override
	public I getImplementorOfI() {

		return new InnerImplementor();
	}
}
