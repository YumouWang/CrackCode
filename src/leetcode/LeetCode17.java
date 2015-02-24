package leetcode;

import java.util.LinkedList;
import java.util.List;

public class LeetCode17 {
	public List<String> letterCombinations1(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl",
				"mno", "pqrs", "tuv", "wxyz" };
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int x = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				for (char s : mapping[x].toCharArray())
					ans.add(t + s);
			}
		}
		return ans;
	}

	public List<String> letterCombinations(String digits) {
		List<String> result = new LinkedList<String>();
		String[] mapping = new String[] { "0", "1", "abc", "def", "ghi", "jkl",
				"mno", "pqrs", "tuv", "wxyz" };
		
		if (digits.length() == 0) {
			return result;
		}
		if (digits.length() == 1) {
			int index = Integer.parseInt(String.valueOf(digits.charAt(0)));
			for (char s : mapping[index].toCharArray()) {
				result.add(String.valueOf(s));
			}
			return result; 
		}
		
		List<String> temp = letterCombinations(digits.substring(1));
		int index = Integer.parseInt(String.valueOf(digits.charAt(0)));
		for (String s : temp) {
			for (char c : mapping[index].toCharArray()) {
				result.add(String.valueOf(c) + s);
			}
		}		
		return result;
	}

	public static void main(String[] args) {
		LeetCode17 l = new LeetCode17();
		System.out.println(l.letterCombinations1("123"));
		System.out.println(l.letterCombinations("123"));
	}
}
