package leetcode;

import java.util.LinkedList;
import java.util.List;

public class NQueen {
	List<String[]> result = new LinkedList<String[]>();

	public List<String[]> solveNQueens(int n) {
		int[] colQ = new int[n];
		findNQ(colQ, 0);
		return result;
	}

	public void findNQ(int[] colQ, int curcol) {
		if (curcol == colQ.length)
			//System.out.println("```");
			result.add(getOutput(colQ));
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

	public String[] getOutput(int[] colQ) {		
		String[] outstr = new String[colQ.length];
		StringBuilder strbd = new StringBuilder();
		for (int i = 0; i < colQ.length; i++) {
			strbd.append('.');
		    //System.out.print(colQ[i]);
		}
		//System.out.println(strbd);
			
		for (int i = 0; i < colQ.length; i++) {
			strbd.setCharAt(i, 'Q');
			//System.out.println(strbd);
			outstr[colQ[i]] = strbd.toString();
			strbd.setCharAt(i, '.');
		}
		return outstr;
	}
	
	public static void main(String[] args) {
		NQueen n = new NQueen();
		List<String[]> result = n.solveNQueens(1);
		for (String[] string : result) {
			for (int i = 0; i < string.length; i++) {
				System.out.print(string[i] + ",");
			}
			System.out.println();
		}
	}

}
