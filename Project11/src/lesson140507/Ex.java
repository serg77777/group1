package lesson140507;

public class Ex {
	public static void main(String[] args) {
		m();

	}

	private static void m() {
		n();
	}

	private static void n() {
		try {
			o();
		} catch (RuntimeException e) {
			System.out.println("aaaaaaaaaaaa");
			
		}

	}

	private static void o() throws RuntimeException {
		throw new RuntimeException();
	}

}
