package lesson140428.variable;

public class Example2 {

	static void varTest(int... v) {

	}

	static void varTest(boolean... v) {

	}

	public static void main(String[] args) {

		varTest(1, 2, 3);
		varTest(true, false, false);
		// varTest(); compile error
	}
}
