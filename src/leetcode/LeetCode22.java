package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        if (n == 0) {
        	result.add("");
        	return result;
        }
        for (int i = 0; i < n; i++) {
            List<String> left = generateParenthesis(i);
            List<String> right = generateParenthesis(n - 1 - i);
            for (String l : left) {
                for (String r : right) {
                    result.add("(" + l + ")" + r);
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
    	LeetCode22 l = new LeetCode22();
    	System.out.println(l.generateParenthesis(4));
    }

}
