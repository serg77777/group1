package lesson140407.exceptions;

public class UseTryCatchFinally {

	public static void main(String[] args) {
		
			doSomething();
	}

	private static void doSomething() {
		
		System.out.println("before");
		
		try {
			System.out.println("inside");
			do2();
			System.out.println("inside2");
		} catch (Exception e) {
			System.out.println("catch");
			do3();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("after");
	}

	private static void do3() {
		throw new RuntimeException();
	}

	private static void do2() {
		throw new RuntimeException();
	}
	
}
