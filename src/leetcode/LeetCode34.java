package leetcode;

public class LeetCode34 {
	public int[] searchRange(int[] A, int target) {
		if (A.length < 1) {
			return new int[] { -1, -1 };
		}
		int index = binarySearch(A, 0, A.length - 1, target);
		if (index == -1) {
			return new int[] { -1, -1 };
		}
		int[] result = new int[2];
		int starting = index;
		int ending = index;
		while (A[starting] == target) {
			starting--;
			if (starting == -1) {
				starting = -1;
				break;
			}
		}
		System.out.println(starting + 1);
		while (A[ending] == target) {
			ending++;
			if (ending == A.length) {
				ending = A.length;
				break;
			}
		}
		System.out.println(ending - 1);
		result[0] = starting + 1;
		result[1] = ending - 1;
		return result;
	}

	public int binarySearch(int[] A, int start, int end, int target) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (target == A[mid]) {
				return mid;
			} else if (target < A[mid]) {
				return binarySearch(A, start, mid - 1, target);
			} else {
				return binarySearch(A, mid + 1, end, target);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 1 };
		LeetCode34 l = new LeetCode34();
		//System.out.println(l.binarySearch(array, 0, array.length - 1, 5));
		l.searchRange(array, 1);
	}

}
