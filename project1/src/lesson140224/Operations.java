package lesson140224;

public class Operations {
	public static void main(String[] args) {
		int a = 10 + 20 * 30 / 40 - 50;
		int b = a % 2;
		int c = b >> 4;
		int d = c << 2;
		int e = d & 0xff;
		int f = e | 0xff;
		int g = f ^ 0xff; // XOR
		boolean h = g < 10 && a > 20;
		boolean i = a == 0 || d != c;
		System.out.println("h= " + h + ", i= " + i);
		String s = "";

		if (s != null & s.equals("hello")) {
			// TODO
		}
	}
}