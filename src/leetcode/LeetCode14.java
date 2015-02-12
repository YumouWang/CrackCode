package leetcode;

public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null) {
        	return null;
        }
        if (strs.length == 0) {
        	return "";
        }
        String result = "";
        for (int i = 0; i < strs[0].length(); i++) {
        	String temp = String.valueOf(strs[0].charAt(i));
        	for (int j = 0; j < strs.length; j++) {
        		if (i >= strs[j].length()) {
        			return result;
        		} else {
        			if (temp.equals(String.valueOf(strs[j].charAt(i)))) {
        				continue;
        			} else {
        				return result;
        			}
        			
        		}
        	}
        	result += temp;
        }       
        return result;
    }
    
    public static void main(String[] args) {
    	LeetCode14 l = new LeetCode14();
    	System.out.println(l.longestCommonPrefix(new String[]{"a", "ab", "ac"}));
    }

}
