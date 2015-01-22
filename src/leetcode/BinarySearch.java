package leetcode;

public class BinarySearch {
	public int binarySearch(int[] array, int start, int end, int target) {
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (target < array[mid]) {
				return binarySearch(array, start, mid - 1, target);
			} else if (target > array[mid]) {
				return binarySearch(array, mid + 1, end, target);
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public int binarySearch(int[] array, int target) {
		int start = 0;
		int end = array.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (target < array[mid]) {
				end = mid - 1;
			} else if (target > array[mid]) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{1, 3};
		BinarySearch b = new BinarySearch();
		System.out.println(b.binarySearch(array, 4));
		//System.out.println(b.binarySearch(array, 0, 7, 7));
	}

}
