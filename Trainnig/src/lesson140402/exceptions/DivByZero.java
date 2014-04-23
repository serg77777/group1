package lesson140402.exceptions;

public class DivByZero {

	public static void main(String[] args) {

		int result = divide(100, 20);
		System.out.println(result);
		try {
			result = divide(100, 0);
		} catch (Exception ae) {
			if (ae instanceof ArithmeticException) {
				System.err.println("Catched: " + ae.getLocalizedMessage());
				result = Integer.MAX_VALUE;
			}
		}
		System.out.println(result);

		System.out.println("Finished!");
	}

	private static int divide(int i, int j) {

		return i / j;
		// try {
		// } catch (ArithmeticException ae) {
		// System.err.println("Catched: " + ae.getLocalizedMessage());
		// return Integer.MAX_VALUE;
		// }
	}
}
