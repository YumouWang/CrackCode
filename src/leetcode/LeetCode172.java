package leetcode;

public class LeetCode172 {
	public int trailingZeroes(int n) {
		int res = 0;
		while (n != 0) {
			n /= 5;
			res += n;
		}
		return res;
	}

	public int getFactorial(int n) {
		int result = 1;
		while (n != 0) {
			result *= n;
			n = n - 1;
		}
		return result;
	}

	public static void main(String[] args) {
		LeetCode172 l = new LeetCode172();
		System.out.println(l.trailingZeroes(13));
		System.out.println(l.getFactorial(13));
	}

}
