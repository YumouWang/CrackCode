package leetcode;

import java.util.Stack;

public class LeetCode20 {
    public boolean isValid(String s) {
    	if (s.length() % 2 != 0) {
    		return false;
    	}
        Stack<String> stack1 = new Stack<String>();
        Stack<String> stack2 = new Stack<String>();
        
        for (int i = 0; i < s.length(); i++) {
        	stack1.push(String.valueOf(s.charAt(i)));
        }
        while (!stack1.isEmpty()) {
        	if (!stack2.isEmpty()) {
        		if (isValid(stack1.peek(), stack2.peek())) {
            		stack1.pop();
            		stack2.pop();
            	} else {
            		stack2.push(stack1.pop());
            	}
        	} else {
        		String temp = stack1.pop();
            	stack2.push(temp);
            	if (isValid(stack1.peek(), stack2.peek())) {
            		stack1.pop();
            		stack2.pop();
            	}
        	}    	
        }
        if (stack2.isEmpty()) {
        	return true;
        } else {
        	return false;
        }
    }
    
    public boolean isValid(String s1, String s2) {
    	if (s1.equals("{") && s2.endsWith("}")) {
    		return true;
    	} else if (s1.equals("[") && s2.endsWith("]")) {
    		return true;
    	} else if (s1.equals("(") && s2.endsWith(")")) {
    		return true;
    	}
    	return false;
    }
    
    public static void main(String[] args) {
    	String s = "([])";
    	LeetCode20 l = new LeetCode20();
    	System.out.println(l.isValid(s));
    }

}
