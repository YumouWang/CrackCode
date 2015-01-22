package leetcode;

public class LeetCode88 {
	public void merge(int A[], int m, int B[], int n) {
        if (n == 0) {
        	return;
        }
        if (m == 0) {
        	for (int i = 0; i < n; i ++) {
        		A[i] = B[i];
        	}
        }
        int i = 0;
        int j = 0;
        int array[] = new int[m];
        for (i = 0; i < m; i ++) {
        	array[i] = A[i];
        }
        i = 0;
        int index = 0;
        while (i < m && j < n) {
        	if (array[i] > B[j]) {
        		System.out.println(i + "," + j + "," + index + "```");
        		A[index] = B[j];
        		index ++;
        		j ++;
        	} else {
        		A[index] = array[i];
        		System.out.println(i + "," + j + "," + index);
        		index ++;
        		i ++;
        	}
        }
        System.out.println(i + "," + j + "," + index);
        if (i < m) {
        	while (i < m) {
        		A[index ++] = array[i ++];
        	}
        }
        if (j < n) {
        	while (j < n) {
        		A[index] = B[j];
        		index ++;
        		j ++;
        	}
        }
    }
	
	public static void main(String[] args) {
		LeetCode88 l = new LeetCode88();
		int[] A = new int[]{1, 0};
		int[] B = new int[]{3};
		l.merge(A, 1, B, 1);
		for (int i = 0; i < 2; i ++) {
			System.out.println(A[i]);
		}
	}

}
