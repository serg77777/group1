package lesson140225;

public class MatrixExam {
	public static void main(String[] args) {
		int [ ][ ] matrix = {
				{20, 30, 40},
				{10, 50, 60},
				{70, 80, 90}
		};		
		int [ ][ ] matrix2 = {
						{20},
						{10, 50},
						{70, 80, 90}
						
		};
		
		int[][][] matrix3;
//		printMatrix(matrix);
//		printMatrix(matrix2);
		findInMatrix(matrix, 90);
		
	}

	private static void findInMatrix(int[][] matrix, int item) {
		int ii=-1, jj = -1;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]==item) {
					
					ii = i;
					jj = j;
					System.out.println("Found at " + ii + "."  + jj );
					
					break OUTER;
				}
				
			}
			
		}
		
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println(matrix[i][j]+ "  ");
				
			}
			System.out.println();
		}
		
	}

}
