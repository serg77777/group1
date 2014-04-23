
public class Matrix {
	public static void main(String[] args) {
		
		int [][] matrix = {
				{0, 1, 2},
				{3, 4, 5,},
				{6, 7, 8}
		};
		
		int [][] matrix2 = {
				{0},
				{1, 2},
				{3, 4, 5}
		};
		
		printMatrix(matrix);
		System.out.println();
		printMatrix(matrix2);
		
		
		
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
