package lesson140225;

public class Operators {
	public static void main(String[] args) {
		
		String s = null;
		if (s != null && s.equals("Hello")){
			System.out.println("Hello too");
		}
		
		System.out.println(1<<3);
		
		int x = 2334234;
		
		System.out.println(x & 0xFF);
	}
}
