package leetcode;

import java.util.Stack;

public class LeetCode32 {
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;
		int left = -1;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '(') {
				stack.push(j);
				System.out.println(stack);
			} else {
				if (stack.isEmpty()) {
					left = j;
					System.out.println("left = " + left);
				} else {
					stack.pop();
					if (stack.isEmpty()) {
						max = Math.max(max, j - left);
					} else {
						max = Math.max(max, j - stack.peek());
					}
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LeetCode32 l = new LeetCode32();
		System.out.println(l.longestValidParentheses(")()())"));
	}

}
