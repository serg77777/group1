package lesson140402.exeption;

public class UseFinalyandReturn {
	
	public static void main(String[] args) {
		
		System.out.println(Culculate());

		
		
	}

	private static int Culculate(){
		int result =0;
		try {
			result = 100/20;
			System.out.println("!!!");
			return result;
		} finally  {
			return 10;
		}
	}

}
