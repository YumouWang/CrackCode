package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public String convert(String s, int nRows) {
    	if (nRows <= 1) {
    		return s;
    	}
    	if (s.length() <= nRows) {
    		return s;
    	}
        if (s.length() == nRows) {
        	return s;
        }
        int length = s.length();
        int n = 2 * nRows - 2;
        int m = nRows - 1;
        List<List<String>> result = new ArrayList<List<String>>();
        for (int i = 0; i < nRows; i++) {
        	List<String> currentList = new ArrayList<String>();
        	result.add(currentList);
        }
        
        for (int i = 0; i < length; i++) {
        	if (i % n < m) {
        		result.get(i % n).add(String.valueOf(s.charAt(i)));
        	} else {
        		result.get( n - i % n).add(String.valueOf(s.charAt(i)));
        	}
        }
        System.out.println(result);
        
        String resultStr = "";
        for (List<String> list : result) {
        	for (String str : list) {
        		resultStr += str;
        	}
        }
        return resultStr;
    }
    
    public static void main (String[] args) {
    	LeetCode6 l = new LeetCode6();
    	System.out.println(l.convert("PAYPALISHIRING", 3));
    }

}
