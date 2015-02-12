package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode91 {
    public int numDecodings(String s) {
    	if (s.length() == 0) {
    		return 0;
    	}
    	if (s.length() == 1) {
    		return 1;
    	}
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < s.length(); i++) {
        	int number = Integer.parseInt(String.valueOf(s.charAt(i)));
        	numbers.add(number);
        }    
        return getNumDecodings(numbers);
    }
    
    public int getNumDecodings(List<Integer> numbers) {
    	if (numbers.size() == 0) {
    		return 0;
    	} else if (numbers.size() == 1) {
    		return 1;
    	} else {
    		if (numbers.get(0) <= 2 && numbers.get(1) <= 6) {
        		return getNumDecodings(numbers.subList(1, numbers.size())) + getNumDecodings(numbers.subList(2, numbers.size()));
        	} else {
        		return getNumDecodings(numbers.subList(1, numbers.size()));
        	}
    	}   	
    }
    
    public static void main(String[] args) {
    	LeetCode91 l = new LeetCode91();
    	System.out.println(l.numDecodings("123"));
    }

}
