package lesson140225;

public class ContinueExample {
	public static void main(String[] args) {
		int a[] = {12, 13, 14, 15, -10, 14, 17};
		int x = 14;
		int index = findAll(a,x);
	}

	private static int findAll(int[] a, int x) {
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				System.out.println("found "+ x +" at " + i);
				continue;
			}
			System.out.println("a[i] != x : "+ a[i]);
		}
		return 0;
	}
}
