package lesson140407.exceptions;

public class UseTryCatchFinally {

	public static void main(String[] args) {

		doSomething();
	}

	private static void doSomething() {

		System.out.println("Before");
		try {
			System.out.println("Inside");
			doException();
			System.out.println("Inside, continued");
		} catch (Exception e) {
			System.out.println("Catch");
			doCatchRoutine();
		} finally {
			System.out.println("Finally");
		}
		System.out.println("After");
	}

	private static void doCatchRoutine() {

		throw new RuntimeException();
	}

	private static void doException() {

		throw new RuntimeException();
	}
}
