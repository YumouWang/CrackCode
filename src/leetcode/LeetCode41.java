package leetcode;

public class LeetCode41 {
	public int firstMissingPositive(int[] A) {
		int temp = 0;
		int minPositive = 0;
		int maxPositive = 0;
		if (A.length == 0) {
			return 1;
		}
		int i;
		for (i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				temp = A[i];
				break;
			}
		}
		System.out.println(temp + "--" + "i" + i);
		
		minPositive = temp;
		maxPositive = temp;

		for (int j = 0; j < A.length; j++) {
			if (A[j] < minPositive && A[j] > 0) {
				minPositive = A[j];
			}
		}
		System.out.println(minPositive + "minPositive");
		
		for (int j = 0; j < A.length; j++) {
			if (A[j] > maxPositive && A[j] > 0) {
				maxPositive = A[j];
			}
		}
		System.out.println(maxPositive + "maxPositive");

		int a[] = new int[maxPositive + 1];
		if (minPositive == 0) {
			return 1;
		} else if (minPositive == 1) {
			for (i = 0; i < A.length; i++) {
				if(A[i] > 0) a[A[i]] = 1;
			}
			int j = 1;
			for (j = 1; j < a.length; j ++) {
				if(a[j] == 0) {
					break;
					
					
				} else {
					continue;
				}
			}
			return j;			
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] { 100, 1 ,2, 3};
		LeetCode41 l = new LeetCode41();
		System.out.println(l.firstMissingPositive(array));
	}

}
