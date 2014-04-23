package lesson140326.inner;

public class A {

	private static int counter;

	protected static class Ai {

		public static void printCounter() {

			System.out.println(counter);
		}
	}

	private int state = 20;

	public int getState() {

		return state;

	}
}
