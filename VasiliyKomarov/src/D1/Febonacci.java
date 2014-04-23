package D1;

public class Febonacci {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			int result = febo(i);
			System.out.println("result = " + "" + result);
		}
	}

	private static int febo(int i) {
		int result;
		if (i <= 2) {
			return 1;
		}
		result = febo(i - 1) + febo(i - 2);
		return result;
	}
}
