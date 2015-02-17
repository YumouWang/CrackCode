package leetcode;

public class LeetCode59 {
    public int[][] generateMatrix(int n) {
        if (n == 0) {
        	return new int[][]{};
        }
        if (n == 1) {
        	int[][] result = new int[1][1];
        	result[0][0] = 1;
        	return result;
        }
        int startX = 0;
        int startY = 0;
        int width = n - 1;
        int height = n - 1;
        int[][] result = new int[n][n];
        int number = 1;
        int half;
        if (n % 2 == 0) {
        	half = n / 2;
        } else {
        	half = n / 2 + 1;
        }
        while (startX < half && width >= 0) {
        	for (int i = startX; i <= startX + width; i++) {
        		result[startY][i] = number;
        		number += 1;
        	}
        	for (int j = startY + 1; j <= startY + height; j++) {
        		result[j][startX + width] = number;
        		number += 1;
        	}
        	for (int p = startX + width - 1; p >= startX; p--) {
        		result[startY + height][p] = number;
        		number += 1;
        	}
        	for (int q = startY + height - 1; q > startY; q--) {
        		result[q][startX] = number;
        		number += 1;
        	}
        	startX++;
        	width = width - 2;
        	startY++;
        	height = height - 2;
        }
        return result;
    }
    
    public static void main(String[] args) {
    	LeetCode59 l = new LeetCode59();
    	int result[][] = l.generateMatrix(0);
    	for(int i = 0; i < result.length; i++) {
    		for (int j = 0; j < result[0].length; j++) {
    			System.out.print(result[i][j] + ",");
    		}
    		System.out.println();
    	}
    	String s = "a";
    	System.out.println(Integer.parseInt(s));
    }

}
