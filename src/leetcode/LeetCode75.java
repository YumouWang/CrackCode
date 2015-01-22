package leetcode;

public class LeetCode75 {
    public void sortColors(int[] A) {
    	if (A == null || A.length == 0) {
    		return;
    	}
    	int index = 0;
    	int temp = 0;
    	for (int i = 0; i < 3; i ++) {
    		for (int j = 0; j < A.length; j ++) {
    			if (A[j] == i) {
    				temp = A[j];
    				A[j] = A[index];
    				A[index] = temp;
    				index++;
    			}
    		}
    	}      
    }
    
    public static void main(String[] args) {
    	int[] A = new int[]{0, 1, 2, 2, 1, 0, 1};
    	LeetCode75 l = new LeetCode75();
    	l.sortColors(A);
    	for (int i = 0; i < A.length; i++) {
    		System.out.print(A[i] + ",");
    	}
    }
    

}
