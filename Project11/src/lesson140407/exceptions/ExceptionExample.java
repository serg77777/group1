package lesson140407.exceptions;

public class ExceptionExample {

	public static class MyException extends Exception {

	}

	public static class MyException2 extends MyException {

	}

	public static void main(String[] args) {
		try {
			doSomtheing();
		} catch (MyException2 e) {
			System.out.println("MyException2");
			// } catch (MyException e) {
			// System.out.println("MyException");
		} catch (Exception e) {
			System.out.println("Exception");
		}

	}

	private static void doSomtheing() throws MyException2 {
		try {
			doAnotherthing();
		} catch (MyException e) {
			System.out.println("MyException");
		}
		// ......
		throw new MyException2();
	}

	private static void doAnotherthing() throws MyException {
		throw new MyException();
	}
}
