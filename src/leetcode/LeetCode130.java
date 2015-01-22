package leetcode;

public class LeetCode130 {
	public void solve(char[][] board) {
		int row = board.length;
		int col = board[0].length;
		char[][] temp = board;
        for (int i = 1; i < row - 1; i ++) {
        	for (int j = 1; j < col - 1; j ++) {
        		System.out.println(temp[i][j]);
        		if (temp[i - 1][j] == 'X' && temp[i + 1][j] == 'X' && temp[i][j - 1] == 'X' && temp[i][j + 1] == 'X') {
        			board[i][j] = 'X';
        		}
        	}
        }
    }
	
	public static void main(String[] args) {
		char[][] board = new char[][]{{'X','X','X','X'},
				{'X', 'O', 'O', 'X'},
				{'X', 'X', 'O', 'X'},
				{'X', 'O', 'X', 'X'}};
		LeetCode130 l = new LeetCode130();
		l.solve(board);
		int row = board.length;
		int col = board[0].length;
		for (int i = 0; i < row; i ++) {
        	for (int j = 0; j < col; j ++) {
        		System.out.print(board[i][j]);
        		
        	}
        	System.out.println();
        }
	}

}
