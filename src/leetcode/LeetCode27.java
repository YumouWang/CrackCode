package leetcode;

public class LeetCode27 {
	public int removeElement(int[] A, int elem) {
		if (A == null || A.length == 0) {
			return 0;
		}
		int length = A.length;
		for (int i = 0; i < A.length; i++) {
			while (A[i] == elem && i < length) {
				A[i] = A[--length];
			}
		}
		return length;
	}

	public static void main(String[] args) {

	}

}
