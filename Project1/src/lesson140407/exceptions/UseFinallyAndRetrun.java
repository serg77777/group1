package lesson140407.exceptions;

public class UseFinallyAndRetrun {

	public static void main(String[] args) {
		
		System.out.println(calcSomething());
		
	}

	private static int calcSomething() {
		int result = 0;
		
		try {
			result = 100 / 0;
			return result;
		}
		finally {
			return 10;
		}
	}
	
}
