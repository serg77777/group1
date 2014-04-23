package lesson140225;

public class Gla {
	public static void main(String[] args) {
		int x =20;
		if (x % 2 == 0) {
			System.out.println("x Error");
		} else{
			System.out.println("v Error");
		}
			System.out.println(!(x% 2 ==0) ? "x Error" : "v Error");
			System.out.println(!true);
			String s = null;
			if (s != null && s.equals("hello!")){			
				System.out.println("hello true!");
				
				
			}
	}

}
