package leetcode;

public class LeetCode179 {
	public String largestNumber(int[] num) {
		if (num == null || num.length == 0) {
			return null;
		}
		if (isAllZero(num)) {
			return "0";
		}
				
		int i = 0;
		int temp = 0;
		for (i = 0; i < num.length; i++) {
			for (int j = i; j < num.length; j++) {
				if (!isLarger(num[i], num[j])) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		String result = "";
		for (i = 0; i < num.length; i++) {
			result += String.valueOf(num[i]);
		}
		return result;
	}
	
	public boolean isAllZero(int[] num) {
		int i = 0;
		while (i < num.length) {
			if (num[i] != 0) {
				return false;
			}
			i ++;
		}
		return true;
	}

	public boolean isLarger(int num1, int num2) {
		String str1 = String.valueOf(num1);
		String str2 = String.valueOf(num2);
		String result1 = str1 + str2;
		String result2 = str2 + str1;
		if (result1.length() > result2.length()) {
			return true;
		} else if (result1.length() < result2.length()) {
			return false;
		} else {
			for (int i = 0; i < result1.length(); i++) {
				if (Integer.parseInt(String.valueOf(result1.charAt(i))) > Integer.parseInt(String.valueOf(result2.charAt(i)))) {
					return true;
				} else if (Integer.parseInt(String.valueOf(result1.charAt(i))) < Integer.parseInt(String.valueOf(result2.charAt(i)))) {
					return false;
				} else {
					continue;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 0, 0 };
		LeetCode179 l = new LeetCode179();
		System.out.println(l.largestNumber(array));
	}

}
