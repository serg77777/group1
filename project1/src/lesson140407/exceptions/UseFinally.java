package lesson140407.exceptions;

public class UseFinally {

	public static void main(String[] args) {

		// try-catch-finally

		// get resource
		System.out.println("open");
		try {
			// work with resource
			System.out.println("work");
			doSomething();
			System.out.println("go on working");
		} finally {
			// free resource
			System.out.println("close");
		}
		System.out.println("finish");
	}

	private static void doSomething() {

		throw new RuntimeException("disaster");

	}

}
