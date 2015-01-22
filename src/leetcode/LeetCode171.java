package leetcode;

public class LeetCode171 {
	public int titleToNumber(String s) {
		if (s == null) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + s.charAt(i) - 'A' + 1;
		}
		return result;
	}

	public static void main(String[] args) {
		LeetCode171 l = new LeetCode171();
		System.out.println(l.titleToNumber("A"));
		System.out.println(l.titleToNumber("B"));
		System.out.println(l.titleToNumber("C"));
		System.out.println(l.titleToNumber("AA"));
		System.out.println(l.titleToNumber("AB"));
		System.out.println(l.titleToNumber("BA"));
	}

}
