package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		if (matrix.length == 0) {
			return result;
		}

		int beginRow = 0;
		int beginCol = 0;
		int endRow = matrix.length - 1;
		int endCol = matrix[0].length - 1;

		while (beginRow <= endRow && beginCol <= endCol) {
			for (int i = beginCol; i <= endCol; i++) {
				result.add(matrix[beginRow][i]);
			}
			beginRow++;

			for (int i = beginRow; i <= endRow; i++) {
				result.add(matrix[i][endCol]);
			}
			endCol--;

			if (beginRow <= endRow) {
				for (int i = endCol; i >= beginCol; i--) {
					result.add(matrix[endRow][i]);
				}
			}
			endRow--;

			if (beginCol <= endCol) {
				for (int i = endRow; i >= beginRow; i--) {
					result.add(matrix[i][beginCol]);
				}
			}
			beginCol++;
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][]{{2,5},{8,4},{0,-1}};
		LeetCode54 l = new LeetCode54();
		List<Integer> list = l.spiralOrder(matrix);
		for(Integer integer : list) {
			System.out.print(integer + ",");
		}

	}

}
