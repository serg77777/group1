package lesson140407.exceptions;

public class UseFinallyAndReturn {

	public static void main(String[] args) {

		System.out.println(CalculateSomething());
	}

	private static int CalculateSomething() {

		int result = 0;
		try {
			result = 100 / 20;

		} finally {
			return 10;
		}

	}
}