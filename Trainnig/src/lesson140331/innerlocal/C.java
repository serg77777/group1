package lesson140331.innerlocal;

public class C implements X {

	static class StaticInnerImplementor implements I {

		@Override
		public void doIt() {

			System.out.println("I did it, but from inside");
		}
	}

	@Override
	public I getImplementorOfI() {

		return new StaticInnerImplementor();
	}
}
