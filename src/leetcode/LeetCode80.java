package leetcode;

public class LeetCode80 {
	public int removeDuplicates(int[] A) {

		if (A.length == 0) {
			return 0;
		}
		if (A.length == 1) {
			return 1;
		}
		if (A.length == 2) {
			return 2;
		}
		int result = 2;
		int j = 2;
		int[] B = new int[A.length];
		B[0] = A[0];
		B[1] = A[1];
		//B = A;
		for (int i = 2; i < A.length; i++) {
			//System.out.println(A[i] + ",," + A[i - 1] + ",," + A[i - 2] + "!!!");
			if (A[i] == A[i - 1] && A[i] == A[i - 2]) {

			} else if (A[i] == A[i - 1] && A[i] != A[i - 2]) {
				result++;
				B[j] = A[i];
				//System.out.println(i + "," + j);
				j++;
			} else {
				B[j] = A[i];
				//System.out.println(i + "]" + A[i] + ",," + A[i - 1] + ",," + A[i - 2]);
				//System.out.println(i + "," + j + "----");
				result++;
				j++;
			}			
		}
		
		for(int i = 0; i < B.length; i ++) {
			A[i] = B[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1,1,1,2,2,3};
		LeetCode80 l = new LeetCode80();
		System.out.println(l.removeDuplicates(array));
		for (int i = 0; i < l.removeDuplicates(array); i++) {
			System.out.println(array[i]);
		}
	}
}
