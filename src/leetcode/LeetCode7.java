package leetcode;

public class LeetCode7 {
	public int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		int result = 0;
		int tail = 0;
		int temp = 0;
		while (x != 0) {
			tail = x % 10;
			temp = result * 10 + tail;
			if ((temp - tail) / 10 != result) {
				return 0;
			}
			result = temp;
			x = x / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		LeetCode7 l = new LeetCode7();
		System.out.println(l.reverse(-123));
		System.out.println(-123 % 10);

	}

}
