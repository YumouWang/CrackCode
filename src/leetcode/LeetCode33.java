package leetcode;

public class LeetCode33 {
	public int search(int[] A, int target) {
		if (A.length == 0) {
			return -1;
		}
		if (A.length == 1) {
			if (A[0] == target) {
				return 0;
			}
			return -1;
		}
		int start = 0;
        for (int i = 1; i < A.length; i ++) {
        	if (A[i - 1] > A[i]) {
        		start = i;
        	}
        }
        
        int j = 0;
        int[] temp = new int[A.length];
        System.out.println(start + "``" + temp.length);
        for (int i = start; i < A.length; i ++ ) {
        	temp[j] = A[i];
        	j ++;
        }
        for (int i = 0; i < start; i ++ ) {
        	temp[j] = A[i];
        	j ++;
        }
        for (int i = 0; i < temp.length; i ++ ) {
        	System.out.print(temp[i] + ",");
        }
        System.out.println();
        int index = binarySearch(temp, 0, temp.length - 1, target);
        if (index == -1) {
        	return -1;
        }
        return (index + start) % A.length;
    }
	
	public int binarySearch(int[] array, int start, int end, int target) {
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			System.out.println(mid);
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
	
	public static void main(String[] args) {
		int[] array = new int[]{3, 1};
		LeetCode33 l = new LeetCode33();
		System.out.println(l.search(array, 4));
	}

}
