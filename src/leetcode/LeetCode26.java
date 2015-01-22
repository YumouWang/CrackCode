package leetcode;

public class LeetCode26 {
	public int removeDuplicates(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int result = 1;
		int temp = A[0];
		int j = 1;
        for (int i = 0; i < A.length; i ++) {
        	if (A[i] != temp) {
        		result ++;
        		temp = A[i];
        		A[j] = A[i];
        		j ++;
        	}
        }  
        return result;
    }
	
	
	public static void main(String[] args) {
		int[] array = new int[]{1,1,2,2,3,4,4,5};
		LeetCode26 l = new LeetCode26();
		System.out.println(l.removeDuplicates(array));
		for (int i = 0; i < l.removeDuplicates(array); i ++) {
			System.out.println(array[i]);
		}
	}

}
