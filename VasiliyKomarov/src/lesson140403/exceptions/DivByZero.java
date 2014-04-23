package lesson140403.exceptions;

import java.io.ObjectInputStream.GetField;

public class DivByZero {

	
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Usage DivByZero <number1> <number2>");
			System.exit(0);
		}
			
		processArgs(args);
		
		System.out.println("Program finished");	
		
	}

	private static void processArgs(String[] args) {
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		
		int result;
		
		try {
			result = divide(number1, number2);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("problem: " + ae.getMessage());
		result = Integer.MAX_VALUE;
		}
		
		
		System.out.println("result=" + result);
	}

	private static int divide(int number1, int number2) {
		
//		if (number2 == 0) {
//			System.out.println("Деление на ноль! ХАМ!");
//			System.exit(0);
//			return 0;
//			
//		} else {
			return  number1 / number2;
//		}
		
	}
	
}
