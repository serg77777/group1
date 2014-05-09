package lesson140428.variable;

public class Examples {

	public static void main(String[] args) {

		int i = sum(1, 2);
		System.out.println(i);
		int j = sum(1, 2, 3);
		System.out.println(j);
	}

	private static int sum(int... numbers) {

		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	private static int sum2(int first, int... numbers) {

		int sum = first;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
	// private static void wrong(int... i, int j);
	// private static void alsoWrong(int... i, int... j);
}
