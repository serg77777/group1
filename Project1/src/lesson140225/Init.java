package lesson140225;

public class Init {

	public static void main(String[] args) {
		
		int x;
		x = 20;
		
		int[] a = new int[x];
		
		
		int[] c;
		
		c = new int[] {1,2,3,4,4};
		
		
		for (int element : a) {
			System.out.println(element);
		}
		
		String[] stringArray = new String[5];
		
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		boolean[] bool = new boolean[3];
		for (int i = 0; i < bool.length; i++) {
			System.out.println(bool[i]);
		}

	}

}
