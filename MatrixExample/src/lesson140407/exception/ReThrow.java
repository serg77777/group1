package lesson140407.exception;

public class ReThrow {
	
	public static void main(String[] args) throws Exception {
		
		try {
			do1();
		} catch (Exception e) {
			System.out.println("got exception " + e);
			throw new Exception(e);
			// throw e; another option
		}
		
		
	}

	private static void do1() throws Exception {
		throw new Exception();
	}
	
}
