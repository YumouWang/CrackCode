package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode132 {
	public int minCut(String s) {
		if (s.length() == 0 || s.length() == 1) {
    		return 0;
    	}
		List<List<String>> result = getPartition(s);
		int minCut = result.get(0).size() - 1;
		for (List<String> list : result) {
			if (list.size() - 1 < minCut) {
				minCut = list.size() - 1;
			}
		}
		return minCut;		
	}
	
    public List<List<String>> getPartition(String s) {
    	List<List<String>> result = new ArrayList<List<String>>();
    	if (s.length() == 0) {
    		result.add(new ArrayList<String>());
    		return result;
    	}
    	if (s.length() == 1) {
    		List<String> currentResult = new ArrayList<String>();
    		currentResult.add(s);
    		result.add(currentResult);
    		return result;
    	}

    	for (int i = 1; i <= s.length(); i++) {
    		String str = s.substring(0, i);
    		if (isPalindrome(str)) {
    			List<List<String>> temp = getPartition(s.substring(i));
    			for (List<String> l : temp) {
    				if (l.size() == 0) {
    					l.add(str);
    				} else {
    					l.add(0, str);
    				}   				
    				result.add(l);
    			}
    		}
    	}
    	return result;
    }
    
    public boolean isPalindrome(String str) {
    	if (str.length() == 1) { 
    		return true;
    	}
    	int half = str.length() / 2;
    	for (int i = 0; i < half; i++) {
    		if (String.valueOf(str.charAt(i)).equals(String.valueOf(str.charAt(str.length() - 1 - i)))) {
    			continue;
    		} else {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	LeetCode132 l = new LeetCode132();
    	System.out.println(l.minCut("ab"));
    }

}
