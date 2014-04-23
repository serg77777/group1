package homework.recursion;

public class Recursion {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage:");
			System.out.println("\t-factorial [n] calulates the factorial of n");
			System.out.println("\t-fibonacci [n] calulates the fibonacci of n");
			System.out.println("\t[n] should be positive integer");
			System.exit(-1);
		}
		String fun = args[0];
		int n = 0;
		try {
			n = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
			System.err.println(e);
			System.exit(-1);
		}
		if (n < 0) {
			System.out.println(n + " is not positive!");
			System.exit(-1);
		}
		switch (fun) {
		case "-factorial":
			System.out.println("Factorial of " + n + " is " + factorial(n, 1));
			break;
		case "-fibonacci":
			System.out.println("Fibonacci of " + n + " is "
					+ fibonacci(n, 0, 1));
			break;
		default:
			System.out.println("Error: function " + fun + " not recognised!");
			System.exit(-1);
		}
	}

	public static long factorial(int n, long acc) {
		long result = acc;
		if (n == 0) {
			return acc;
		} else {
			result = factorial(n - 1, n * acc);
		}
		return result;
	}

	public static long fibonacci(int n, long fib1, long fib2) {
		long result = 1;
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return fib1 + fib2;
		} else {
			result = fibonacci(n - 1, fib1 + fib2, fib1);
		}
		return result;
	}
}
