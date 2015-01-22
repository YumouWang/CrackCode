package leetcode;

public class LeetCode136 {
	public static int singleNumber(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		int result = 0;
        for (int i = 0; i < A.length; i ++) {
        	result = result ^ A[i];
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] a = new int[]{1, 1, 3, 3, 5};
		System.out.println(singleNumber(a));
	}

}
