package leetcode;

public class LeetCode35 {
	public int searchInsert(int[] A, int target) {
		if (target <= A[0]) {
			return 0;
		}
		if (target > A[A.length - 1]) {
			return A.length;
		}
		if (target == A[A.length - 1]) {
			return A.length - 1;
		}
		int index = -1;
		int start = 0;
		int end = A.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target < A[mid]) {
				end = mid -1;
			} else if (A[mid] < target) {
				start = mid + 1;
			} else {
				System.out.println(",,,");
				index = mid;
				break;
			}
		}
		System.out.println(index);
		if (index == -1) {			
			for (int i = 0; i < A.length; i ++) {
				if (target < A[i]) {
					System.out.println(A[i]);
					return i;
				}
			}
		}
		return index;
    }
	public static void main(String[] args) {
		int[] array = new int[]{1,3,5,6,7,8,9,10,14};
		LeetCode35 l = new LeetCode35();
		System.out.println(l.searchInsert(array, 11));
	}

}
