package lesson140225;

public class ContinueExmample {
	
	
	public static void main(String[] args) {
		int a[] = {34, 54, 42, 45, 63, 20,  64, 23};
		
		int x = 20; 
		
		int index = findAll(a, x);

	}

	private static int findAll(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == x){
				System.out.println("found at " + i );
				continue;
			}
			
			System.out.println("a[i] != x" + a[i]);
		}
		
		return 0;
	}

}
