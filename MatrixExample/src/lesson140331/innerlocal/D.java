package lesson140331.innerlocal;

public class D implements X {
	public class InnerImplementor implements I {

		int state = 20;
		@Override
		public void doIt() {
			System.out.println("I did it from inside with state " + state);
		}

	}

	public I getImplementorOfI() {
		return new InnerImplementor();
	}
}
