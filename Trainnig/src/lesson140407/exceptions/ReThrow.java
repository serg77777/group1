package lesson140407.exceptions;

public class ReThrow {

	public static void main(String[] args) throws Exception {

		try {
			doException();
		} catch (Exception e) {
			System.out.println("Got exception: " + e);
			throw new Exception(e);
		}
	}

	private static void doException() throws Exception {

		throw new Exception();
	}
}
