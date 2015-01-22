package leetcode;

public class LeetCode74 {
	public boolean searchMatrix(int[][] matrix, int target) {
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		int row = 0;
        for (int i = 0; i < rowNum; i ++) {
        	if(target >= matrix[i][0] && target <= matrix[i][colNum - 1]) {
        		row = i;
        	}
        }
        
        for(int i = 0; i < colNum; i ++) {
        	if(matrix[row][i] == target) {
        		return true;
        	}
        }
        return false;
    }
	
	public static void main(String[] args) {
		int[][] matrix = new int[][]{{1}, {3}};
		LeetCode74 l = new LeetCode74();
		System.out.println(l.searchMatrix(matrix, 3));
	}

}
