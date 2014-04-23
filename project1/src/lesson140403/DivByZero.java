package lesson140403;

public class DivByZero {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("usage DivByZero <N1> <N2>");
			System.exit(0);
		}

		processArgs(args);

		System.out.println("Program finished");
	}

	private static void processArgs(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		int result;
		try {
			result = divide(n1, n2);
		} catch (ArithmeticException ae) {
			// ae.printStackTrace();
			System.out.println("Problem: " + ae.getMessage());
			result = Integer.MAX_VALUE;
		}

		System.out.println("result = " + result);
	}

	private static int divide(int n1, int n2) {

		return n1 / n2;
	}

}
