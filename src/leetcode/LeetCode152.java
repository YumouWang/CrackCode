package leetcode;

public class LeetCode152 {
	public int maxProduct(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }
        int max = A[0], min = A[0], result = A[0];
        for (int i = 1; i < A.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * A[i], min * A[i]), A[i]);
            min = Math.min(Math.min(temp * A[i], min * A[i]), A[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] array = new int[]{2,3,-2,4};
		LeetCode152 l = new LeetCode152();
		System.out.println(l.maxProduct(array));
	}

}
