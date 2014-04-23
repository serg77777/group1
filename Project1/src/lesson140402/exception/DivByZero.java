package lesson140402.exception;

public class DivByZero {

	public static void main(String[] args) {
		
		int result = divide(100, 20);
		System.out.println(result);
		
		result = divide(100, 0);
		System.out.println(result);
	}

	private static int divide(int i, int j) {
		try{
			return i / j;
		}
		catch(ArithmeticException e){
			System.err.println("Devide by Ziro!!! \n"+e.getLocalizedMessage());
			return Integer.MAX_VALUE;
		}
	}

}
