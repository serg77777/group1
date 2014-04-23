package lesson140319;

public class ByValue {
	public static void main(String[] args) {
		int i = 20;
		check(i);
		System.out.println(i);
	}

	private static void check(final int i) {
		// i = 30; ERROR: can't change final parameters
	}
}
