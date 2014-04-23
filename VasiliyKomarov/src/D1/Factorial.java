package D1;

public class Factorial {

	public static void main(String[] args) {
		int i = 6;
		fact(i); 
	}

	private static int fact(int i) {
		int result = 1;
		
		if (i <= 1) {
			return 1;
		} else {
			result = i * fact(i - 1);
		}
		System.out.println(result);
		return result;
		
	}


		
		

}
