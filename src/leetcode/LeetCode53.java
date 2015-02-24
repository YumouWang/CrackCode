package leetcode;

public class LeetCode53 {
	public int maxSubArray(int[] A) {
		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return A[0];
		}
		int length = A.length;
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				int temp = 0;
				for (int m = j; m <= i; m++) {
					temp += A[m];
				}
				if (max < temp) {
					max = temp;
					temp = 0;
				}
			}

		}
		return max;
	}

	public static void main(String[] args) {
		LeetCode53 l = new LeetCode53();
		int[] array = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(l.maxSubArray(array));
	}
}
