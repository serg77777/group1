package lesson140407.exceptions;

public class ReThrow {

	public static void main(String[] args) throws Exception {
		
		try {
			do1();
		} catch (Exception e) {
			System.out.println("got  exception" + e);
			throw new Exception(e);
		}
		
	}

	private static void do1() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception();
	}
	
}
