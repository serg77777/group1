package lesson140407.exceptions;

public class ExceptionExample {

	public static class MyException extends Exception {

	}

	public static class MyAnotherException extends MyException {

	}

	public static void main(String[] args) {

		try {
			doSomething();
		} catch (MyAnotherException e) {
			System.err.println("My Another Exception");
			// } catch (MyException e) {
			// System.out.println("My Exception");
		} catch (Exception e) {
			System.err.println("Exception");
		}
	}

	private static void doSomething() throws MyAnotherException {

		try {
			doAnotherThing();
		} catch (MyException e) {
			System.err.println("My Exception");
		}
		// ....
		throw new MyAnotherException();
	}

	private static void doAnotherThing() throws MyException {

		throw new MyException();
	}
}
