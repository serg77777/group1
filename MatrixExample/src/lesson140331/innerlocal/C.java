package lesson140331.innerlocal;

public class C implements X {
	public static class StaticInnerImplementor implements I {

		@Override
		public void doIt() {
			// TODO Auto-generated method stub

		}

	}

	public I getImplementorOfI() {
		return new StaticInnerImplementor();
	}
}
