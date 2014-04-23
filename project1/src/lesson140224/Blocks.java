package lesson140224;

public class Blocks {
	
	public static int bigI = 10;

	public static void main(String[] args) {
		{
			int j = 20;
			System.out.println(bigI);
			System.out.println(j);
		}
		// System.out.println(j); ERROR!
		if (bigI < 10) {

		}
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
		// System.out.println(i); ERROR!
	}
}
