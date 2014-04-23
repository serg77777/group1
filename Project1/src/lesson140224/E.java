package lesson140224;

public class E {
	public static void main(String[] args) {

		int a[] = { 10, 20, 40, -20, 40, 67 };
		int index = find(a, 40, 2);
		if (index == -1) {
			System.out.println("Not found");
		} else {
			System.out.println("found at position " + index);
		}

	}

	private static int find(int[] a, int item, int count) {
		int found = -1;
		int found_count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == item) {
				found_count++;
				if (found_count != count) {
					continue;
				} else {
					found = i;
					break;
				}

			}

		}
		System.out.println(found);

		return found;
	}
}
