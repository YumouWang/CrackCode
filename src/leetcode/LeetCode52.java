package leetcode;

import java.util.List;

public class LeetCode52 {
	int result = 0;

	public int solveNQueens(int n) {
		int[] colQ = new int[n];
		findNQ(colQ, 0);
		return result;
	}

	public void findNQ(int[] colQ, int curcol) {
		if (curcol == colQ.length)
			//System.out.println("```");
			result += 1;
		for (int j = 0; j < colQ.length; j++) {
			if (isSafe(colQ, j, curcol)) {
				colQ[curcol] = j;
				findNQ(colQ, curcol + 1);
			}
		}
	}

	public boolean isSafe(int[] colQ, int row, int curcol) {
		int i = 0;
		int j = 0;
		for (i = curcol - 1, j = 1; i >= 0; i--, j++) {
			if (row == colQ[i] || row + j == colQ[i] || row - j == colQ[i])
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		LeetCode52 n = new LeetCode52();
		int result = n.solveNQueens(4);
		System.out.println(result);
	}

}
