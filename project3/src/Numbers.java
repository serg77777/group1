
public class Numbers {
	
	public static void main(String[] args) {
		
		byte b = -128;
		b = 127;
		// b = 128; ERROR!!!
		
		char c = 65;
		System.out.println(c);
		
		short s = 16900;
		s = -1300;
		
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Character.MIN_VALUE);
		
		int i = Integer.MAX_VALUE;
		i = i + 1;
		System.out.println(i);
		
		long l = Long.MAX_VALUE;
		float f = 0.0f;
		double d = 0.0;
		
		d = 0.1e10;
		System.out.println(d);
		
		boolean bool = true;		
		System.out.println(bool == false);
		
		
		
	}
}
