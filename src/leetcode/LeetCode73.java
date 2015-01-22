package leetcode;

import java.util.ArrayList;
import java.util.List;


public class LeetCode73 {
	public void setZeroes(int[][] matrix) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		int rowNum = matrix.length;
		int colNum = matrix[0].length;
		
		for (int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[0].length; j ++) {
				if (matrix[i][j] == 0) {
					List<Integer> position = new ArrayList<Integer>();
					position.add(i);
					position.add(j);
					list.add(position);
				}			
			}			
		}
		
		for(List<Integer> position : list) {
			int row = position.get(0);
			int col = position.get(1);
			System.out.println(row + "-" + col);
			for(int i = 0; i < colNum; i ++) {
				matrix[row][i] = 0;
			}
			
			for(int i = 0; i < rowNum; i ++) {
				matrix[i][col] = 0;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 0, 1} };
		for (int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[0].length; j ++) {
				System.out.print(matrix[i][j] + ",");			
			}
			System.out.println();	
		}
		LeetCode73 l = new LeetCode73();
		l.setZeroes(matrix);
		for (int i = 0; i < matrix.length; i ++) {
			for(int j = 0; j < matrix[0].length; j ++) {
				System.out.print(matrix[i][j] + ",");			
			}
			System.out.println();			
		}
	}

}
