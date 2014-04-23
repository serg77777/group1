
public class C {

	public static void main(String[] args) {
		
		int[] data = { 10, 40, 20, -30, 50, 32 };
		processArray(data);
		
		data = new int[] {30, 20, 30};
		processArray(data);
		
		data = new int[] {};
		processArray(data);
		
		processArray(null);
		
		data = new int[] {2};
		processArray(data);
	}

	private static void processArray(int[] data) {
		int max = findMax(data);		
		printArray(data);
		System.out.println(max);
	}

	public static void printArray(int[] data) {
		// TODO Auto-generated method stub
		if  (data == null) {
			return;
		}
		for (int i : data) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	private static int findMax(int[] data) {
		// TODO Auto-generated method stub
		
		if (data == null) {
			System.out.println("no data : null pointer");
			return Integer.MAX_VALUE;
		}
		
		if (data.length == 0) {
			System.out.println("no data : empty array");
			return Integer.MAX_VALUE;
		}
		
		int max = data[0];
		for (int i = 1; i < data.length; i++) {
			if (data[i] > max) {
				max = data[i];
			}
		}
		
		return max;
	}
}
