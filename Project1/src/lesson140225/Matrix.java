package lesson140225;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{10,20,30,35},
				{40,50,60,65},
				{70,80,90,80},
				{40,50,60,65},
				{70,80,90,95},
		};
		int[][] matrix2 = {
				{10,},
				{40,50,},
				{70,80,90,},
		};
		
		int [][][] cube;

		printMatrix(matrix);
		printMatrix(matrix2);
		
		findInMatrix(matrix,80);
	}

	

	private static void findInMatrix(int[][] matrix, int item) {
		int ii, jj;
		ii = -1;
		jj=-1;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(matrix[i][j] == item) {
					ii = i;
					jj =j;
					System.out.print("found at "+ii +" , "+jj);
					continue OUTER;
				}
			}
		}
		
		
	}



	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
