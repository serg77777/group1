package lesson140407.exceptions;

public class UseFinally {

	public static void main(String[] args) {
		
		System.out.println("open");
		try {
			System.out.println("work");
			doSomething();
			System.out.println("continue work");
		}
		finally {
			System.out.println("close");
		}
		System.out.println("finish");
	}

	private static void doSomething() {
		throw new RuntimeException("disaster");
	}
	
}
