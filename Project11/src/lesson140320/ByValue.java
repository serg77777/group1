package lesson140320;

public class ByValue {

	public static void main(String[] args) {

		int a = 10;
		calc(a);
		System.out.println(a);
	}

	private static void calc(int param) {
		param = 30;
	}

}
