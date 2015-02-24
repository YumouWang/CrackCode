package leetcode;

import java.util.Hashtable;
import java.util.Set;

public class LeetCode137 {
	public int singleNumber(int[] A) {
		int[] result = new int[32];
		for (int i = 0; i < 32; i++) {
			int temp = 0;
			for (int j = 0; j < A.length; j++) {
				temp += (A[j] & (1 << i)) >> i;
				//System.out.println(A[j] + "``");
			}
			//System.out.println(temp);
			result[i] = (temp) % 3;
		}
		int finalResult = 0;

		for (int i = 0; i < 32; i++) {
			finalResult |= result[i] << i;
		}
		return finalResult;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 43, 16, 45, 89, 45, 16, 43, 16, 43, 45 };
		LeetCode137 l = new LeetCode137();
		System.out.println(l.singleNumber(A));
		
		int i = 89;
		System.out.println(i >> 1);
	}
}
