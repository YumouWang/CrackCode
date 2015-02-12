package leetcode;

import java.util.Arrays;

public class LeetCode164 {
	public int maximumGap(int[] num) {
        if (num.length == 0 || num.length == 1) {
            return 0;
        }
        if (num.length == 2) {
            return Math.abs(num[0] - num[1]);
        }
        Arrays.sort(num);
        int gap = 0;
        for (int i = 0; i < num.length - 1; i++) {
        	if (num[i + 1] - num[i] > gap) {
        		gap = num[i + 1] - num[i];
        	}     	
        }
        return gap;
    }
	
	public static void main(String[] args) {
		LeetCode164 l = new LeetCode164();
		int[] num = new int[]{3,6,9,1};
		System.out.println(l.maximumGap(num));
	}

}
