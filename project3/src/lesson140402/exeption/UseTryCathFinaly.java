package lesson140402.exeption;

public class UseTryCathFinaly {
	
	public static void main(String[] args) {
		
		
		doSameThing();
		
	}

	private static void doSameThing() {
		
		System.out.println("before");
		
		try {
			System.out.println("inside");
			do2();
			System.out.println("inside2"); // will not do
			
		} catch (Exception e) {
			System.out.println("catch");
			do3();
		} finally {
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
