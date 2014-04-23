package lesson140224;

public class Numbers {
	public static void main(String[] args) {

		byte b = -128; // 8 bit 1 byte
		// b = 127; ERROR
		System.out.println(--b);

		char c = 65; // 16 bit 2 bytes
		System.out.println(c);

		short s = 16900; // 16 bit 2 bytes
		s = -1300;
		System.out.println(++s);

		int i = Integer.MAX_VALUE; // 32 bit 4 bytes
		System.out.println(++i);

		long l = Long.MAX_VALUE; // 64 bit 8 bytes
		System.out.println(l);

		float f = 0.0f; // 32 bit
		System.out.println(f);

		double d = 0.0; // 64 bit

		d = 0.1e-10;

		System.out.println(d);

		boolean bool = true; // 1 bit
		System.out.println(bool == false);
	}
}
