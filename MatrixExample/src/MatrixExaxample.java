
public class MatrixExaxample {
	public static void main(String[] args) {
		
		int[][] matrix = {
				{10, 20, 30,},
				{40, 50, 60,},
				{70,80, 95,},
				{70,80, 95,},
				{70,80, 95,},
		};
		
		
		int[][] matrix2 = {
				{10, },
				{40, 50,},
				{70, 80, 90,},
		};
		
		printMatrix(matrix);
		printMatrix(matrix2);
		
		findMatrxi(matrix, 80);
		
		
	}
	// »щем матрицу
	// OUTER завершает вышеследующий 
	private static void findMatrxi(int[][] matrix, int item) {
		// TODO Auto-generated method stub
		int ii = -1, jj = -1;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == item) {
					ii = i;
					jj = j;
					continue OUTER;
				}
//				if (ii != -1 || jj != -1) {
//					break;
//				}
			}
		}
		System.out.println("Found at " + ii + ", "+ jj);
	}

	public static void printMatrix(int[][] matrix){
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
