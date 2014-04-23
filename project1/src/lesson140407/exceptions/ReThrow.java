package lesson140407.exceptions;

public class ReThrow {

	public static void main(String[] args) throws Exception {

		try {
			doIt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("got exc " + e);
			// throw e;
			throw new Exception(e);// point the cause /wraps the exception to
									// upper layer
		}

	}

	private static void doIt() throws Exception {

		throw new Exception();

	}

}
