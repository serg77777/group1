package lesson140225;

public class BreakExample {
	
	public static void main(String[] args) {
		int a[] = {12, 13, 14, 15, 16, 17};
		int x = 14;
		int index = find(a, x);
		
		if (index == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println("index of " + x + " is " + index);
		}
	}

	private static int find(int[] a, int item) {
		int found = -1;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == item) {
				found = j;
				break;
			}
		}
		
		return found;
	}

}
