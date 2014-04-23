package lesson140402.exeption;


public class UseFinally {
	
	public static void main(String[] args) {
		
		// get resource
		System.out.println("get");
		try {
			// work wit resource
			System.out.println("work");
			doSomething();
			System.out.println("continiu work");
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
