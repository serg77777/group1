package lesson140403;

public class C implements X {

	public static class StaticInner implements I {

		public void doIt() {

			System.out.println("I did it from StaticInner");
		}
	}

	public I getI() {

		return new StaticInner();
	}
}
