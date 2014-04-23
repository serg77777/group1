package lesson140401.localinner;

public class C  implements ImplementorOfI{

	public static class StaticInner implements I {

		@Override
		public void doIt() {
			System.out.println("I did static innern ");

		}

	}

	public I getImplementationOfI () {
		return new StaticInner();
	}
}
