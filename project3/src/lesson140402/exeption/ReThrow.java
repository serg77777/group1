package lesson140402.exeption;

public class ReThrow {
	
	public static void main(String[] args) throws Exception {
		
		try {
			do1();
		} catch (Exception e) {
			System.out.println("got exeption " +e);
//			throw e;
			throw new Exception(e);
		}
	}

	private static void do1() throws Exception {
		throw new Exception();
		
	}

}
