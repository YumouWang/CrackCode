package leetcode;

public class LeetCode63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;
		int[][] temp = obstacleGrid;
		int[][] arr = new int[m][n];
		for (int i = 0; i < m; i++) {
			if (temp[i][0] != 1) {
				arr[i][0] = 1;
			} else {
				break;
			}
		}
		for (int j = 0; j < n; j++) {
			if (temp[0][j] != 1) {
				arr[0][j] = 1;
			} else {
				break;
			}
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (temp[i][j] != 1) {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
				} else {
					arr[i][j] = 0;
				}				
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + ",");			
			}
			System.out.println();
		}
		return arr[m - 1][n - 1];
	}

	public static void main(String[] args) {
		int[][] array = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		LeetCode63 l = new LeetCode63();
		System.out.println(l.uniquePathsWithObstacles(array));
	}

}
