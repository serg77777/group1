package lesson140225;

public class Init {
	public static void main(String[] args) {
		int x;
		x = 10;

		int[] a = new int[x];
		for (int element : a) {
			System.out.println(element);
		}
//		System.out.println(a);
		int[] b = {10,20,30,40};
		
		int[] c;
		c = new int[] {10,20,30,40,};
		
		String[] strArray = new String[5];
		for (String string : strArray) {
			System.out.println(string);
		}
	}
}
