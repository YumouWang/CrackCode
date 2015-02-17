package leetcode;

public class LeetCode62 {
    public int uniquePaths(int m, int n) {
    	if (m == 0 && n == 0) {
    		return 0;
    	}
    	if (m == 1 || n == 1) {
    		return 1;
    	}
    	if (m == 2 && n == 2) {
    		return 2;
    	}
    	return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);      
    }
    
    public int uniquePaths1(int m, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = 1;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                arr[j] = arr[j] + arr[j-1];
            }
        }
        return arr[m-1];
    }
    
    public static void main(String[] args) {
    	LeetCode62 l = new LeetCode62();
    	System.out.println(l.uniquePaths(51, 9));
    	System.out.println(l.uniquePaths1(51, 9));
    }

}
