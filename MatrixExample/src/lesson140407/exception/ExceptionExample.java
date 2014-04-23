package lesson140407.exception;

public class ExceptionExample {

	public static class MyException extends Exception { // checked exception
			
	}
	public static class MyException2 extends Exception {
		
	}
	
	public static void main(String[] args) {
		try {
			doSomething();
		} catch (MyException2 e) {
			System.out.println("Myexception2");
		
//		  catch (MyException e) {
//			System.out.println("Myexception");
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	private static void doSomething() throws MyException2 {
		try {
			doAnotherThing();
		} catch (MyException e) {
			System.out.println("MyException");
		}
		// ...
		throw new MyException2();
	}

	private static void doAnotherThing() throws MyException {
		throw new MyException();
	}
}
