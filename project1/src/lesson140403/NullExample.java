package lesson140403;

public class NullExample {

	public static void main(String[] args) {

		Object a = null;

		try {
			System.out.println(a.getClass().getSimpleName());
		} catch (NullPointerException npe) {
			System.out.println("NPE: " + npe.getMessage());
		}

		System.out.println("Program continued..");
	}
}
