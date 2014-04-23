package lesson140225;

public class Init {
	public static void main(String[] args) {

		int x;
		x = 20;

		int[] a = new int[x];

		int[] b = {10, 20, 30};
		
		int[] c;
		c = new int[] {1, 2, 3, 4,};
		
		for (int element : a) {
			System.out.println(element);
		}
		
		String[] stringArray = new String[5];
		
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		boolean[] bool= new boolean[3];
		for (boolean b2 : bool) {
			System.out.println(b2);
		}
	}
}
