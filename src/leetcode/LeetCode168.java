package leetcode;

public class LeetCode168 {
	public String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		while (n > 0) {
			n--;
			result.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return result.toString();
	}

	public static void main(String[] args) {
		LeetCode168 l = new LeetCode168();
		System.out.println(l.convertToTitle(27));
		String a = "AA";
		System.out.println(a.length() + "," + a.charAt(0));
	}
}
