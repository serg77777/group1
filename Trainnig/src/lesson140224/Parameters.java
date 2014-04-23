package lesson140224;

public class Parameters {
	public static void main(String[] args) {
		int i = 20;
		process(i);
		System.out.println(i);
	}

	private static void process(final int i) {
		int localI = i * 2;
		System.out.println(localI);
	}
}
