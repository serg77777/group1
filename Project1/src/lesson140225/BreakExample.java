package lesson140225;

public class BreakExample {

	public static void main(String[] args) {
		int a[] = {34, 54, 42, 45, 63, 64, 23};
		
		int index = find(a, 20);
		
		if (index == -1) {
			System.out.println("not found");
		} else {
			System.out.println("index of x" + index ); 
		}
	}

	private static int find(int[] a, int item) {
		int found = -1;
		for (int j = 0; j < a.length; j++) {
			if(a[j] == item) {
				found = j;
				break;
			}
		}
		
		System.out.println("fount at " + found);
		
		return  found;
	}

}
