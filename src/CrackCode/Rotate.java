package CrackCode;

public class Rotate {
	public int[][] rotate (int[][] Matrix) {
		int m = Matrix.length; //row number
		int n = Matrix[0].length; //column number
		int[][] NewMatrix = new int[m][n];
		
		for(int i = 0; i < Matrix.length; i++) {
			for(int j = 0; j < Matrix[0].length; j++) {
				NewMatrix[i][j] = Matrix[j][m - i - 1];
				
			}
		}
		return NewMatrix;
	}
	public void printMatrix(int[][] Matrix) {
		for(int i = 0; i < Matrix.length; i++) {
			for(int j = 0; j < Matrix[0].length; j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] Matrix1 = {{1,2,3,4,5},
							{6,7,8,9,10},
							{11,12,13,14,15},
							{16,17,18,19,20},
							{21,22,23,24,25}};
		Rotate r = new Rotate();
		r.printMatrix(Matrix1);
		System.out.println();
		r.printMatrix(r.rotate(Matrix1));
		
	}
	
	

}
