package leetcode;

import java.util.Arrays;

public class LeetCode31 {
    public void nextPermutation(int[] num) {
    	for (int i = num.length - 1; i > 0; i--) {
            if (num[i] > num[i - 1]) {
                Arrays.sort(num, i, num.length);
                for (int j = i; j < num.length; j++) {
                    if (num[j] > num[i - 1]) {
                    	int temp = num[j];
                    	num[j] = num[i - 1];
                    	num[i - 1] = temp;
                        break;
                    }
                }
                return;
            }
        }
        Arrays.sort(num);
    }
    
    public static void main(String[] args) {
    	int[] array = new int[]{3,2,1};
    	LeetCode31 l = new LeetCode31();
    	l.nextPermutation(array);
    	for (int i = 0; i < array.length; i++) {
    		System.out.print(array[i] + ",");
    	}
    	
    }

}
