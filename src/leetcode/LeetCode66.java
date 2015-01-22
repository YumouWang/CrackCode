package leetcode;

public class LeetCode66 {
	public int[] plusOne(int[] digits) {
		digits[digits.length - 1] = digits[digits.length - 1] + 1;
		for(int i = digits.length - 1; i >= 0; i--) {
			if(digits[i] == 10) {
				if(i == 0) {
					digits = new int[digits.length + 1];
					digits[0] = 1;
					return digits;
				}
				digits[i] = 0;
				digits[i - 1] = digits[i - 1] + 1;
			}
		}
		return digits;
	}

	
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		
		LeetCode66 l = new LeetCode66();
		int[] result = l.plusOne(a);
		for(Integer i : result) {
			System.out.print(i + " ");
		}
		
		
	}

}
