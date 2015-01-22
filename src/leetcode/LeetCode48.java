package leetcode;

public class LeetCode48 {
	
	public void rotate(int[][] matrix) {
		if (matrix.length == 0) {
			return;
		}
		int[][] temp = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < temp.length; i ++) {
			for (int j = 0; j < temp[0].length; j ++) {
				temp[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < temp.length; i ++) {
			for (int j = 0; j < temp[0].length; j ++) {
				matrix[j][matrix.length - 1 - i] = temp[i][j];
			}
		}
    }
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		LeetCode48 l = new LeetCode48();
		l.rotate(matrix);
		for (int i = 0; i < matrix.length; i ++) {
			for (int j = 0; j < matrix[0].length; j ++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
