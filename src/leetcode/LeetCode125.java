package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
        	return true;
        }
        List<String> list = new ArrayList<String>();
        final String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < s.length(); i++) {
        	if (letters.contains(String.valueOf(s.charAt(i)))) {
        		list.add(String.valueOf(s.charAt(i)));
        	}
        }
        return isPalindrome(list);
    }
    
    public boolean isPalindrome(List<String> list) {
    	if (list.size() == 0 || list.size() == 1) { 
    		return true;
    	}
    	int half = list.size() / 2;
    	for (int i = 0; i < half; i++) {
    		if (list.get(i).equalsIgnoreCase(list.get(list.size() - 1 - i))) {
    			continue;
    		} else {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args) {  
    	LeetCode125 l = new LeetCode125();
    	System.out.println(l.isPalindrome("A man, a plan, a canal: Panama"));
    	System.out.println(l.isPalindrome("1a2"));
    }

}
