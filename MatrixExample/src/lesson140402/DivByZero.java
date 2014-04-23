package lesson140402;

public class DivByZero {
	public static void main(String[] args) {
		int result = divade (100, 20);
		System.out.println(result);
		
		result = divade (100, 0);
		System.out.println(result);
	}
 
	private static int divade(int i, int j) {
		try {
			return i/j;
		} catch (ArithmeticException ae) {
			System.err.println("catched " + ae.getLocalizedMessage());
			return Integer.MAX_VALUE;
		}
		
	}
}
