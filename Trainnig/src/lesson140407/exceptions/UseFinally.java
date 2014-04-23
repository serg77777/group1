package lesson140407.exceptions;

public class UseFinally {

	// try - catch - finally
	public static void main(String[] args) {

		// get resource
		System.out.println("Open");
		try {
			// work with resource
			System.out.println("Work");
			doSomething();
			System.out.println("Work");
		} finally {
			// free resource
			System.out.println("Close");
		}
		System.out.println("Finished");
	}

	private static void doSomething() {

		throw new RuntimeException();
	}
}
