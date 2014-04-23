package lesson140402.exceptions;

public class DivByZero {

	public static void main(String[] args) {

		int result = divide(100, 20);
		System.out.println(result);
		try {
			result = divide(100, 0);
		} catch (ArithmeticException ae) {
			if (ae instanceof ArithmeticException) {// learn what type of exc
													// we've caught
			// if (ae.getClass()==ArithmeticException.class){//test for Object
			// class
				System.err.println("catched " + ae.getLocalizedMessage());
				// System.out.println("catched " +
				// ae.getLocalizedMessage());-usual
				// order of lines
				result = Integer.MAX_VALUE;
			}
		}
		System.out.println(result);

		System.out.println("finished");
	}

	private static int divide(int i, int j) {

		return i / j;
		/*
		 * try { return i / j; } catch (ArithmeticException ae) {
		 * System.err.println("catched " + ae.getLocalizedMessage()); //
		 * System.out.println("catched " + ae.getLocalizedMessage());-usual
		 * order of lines return Integer.MAX_VALUE;
		 */
	}
}
