package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeStr {
	public List<String> palindrome(String[] strs) {
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < strs.length; i ++) {
			if (isPalindrome(strs[i])) {
				result.add(strs[i]);
			}
		}
		return result;
	}

	public boolean isPalindrome(String str) {
		if (str == "") {
			return false;
		}
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String[] strs = new String[]{"aa", "level", "ab"};
		PalindromeStr l = new PalindromeStr();
		System.out.println(l.palindrome(strs));
	}

}
