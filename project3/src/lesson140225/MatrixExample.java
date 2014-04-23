package lesson140225;

public class MatrixExample {
	public static void main(String[] args) {
		int[][] matrix = {
				{10,80,30, 80},
				{40,50,60},
				{70,80,90}
				
		};
		int[][] matrix2 = {
				{10},
				{40,50},
				{70,80, 90}
				
		};
		printMatrix(matrix);
		printMatrix(matrix2);
		
		findInMatrix(matrix, 80);
	}

	private static void findInMatrix(int[][] matrix, int item) {
		int ii = -1, jj = -1;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == item) {
					ii = i; jj = j;
					break OUTER;
				}
			}
		}
		System.out.println("found at (" + ii + ", " + jj + ")");
		
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
