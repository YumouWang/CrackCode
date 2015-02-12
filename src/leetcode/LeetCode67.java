package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode67 {
    public String addBinary(String a, String b) {
    	if (a.length() == 0 && b.length() == 0) {
    		return "";
    	}
    	if (a.length() != 0 && b.length() == 0) {
    		return a;
    	}
    	if (a.length() == 0 && b.length() != 0) {
    		return b;
    	}
    	int i = a.length() - 1;
    	int j = b.length() - 1;
    	int carry = 0;
    	int currentResult = 0;
    	int intA = 0;
    	int intB = 0;
    	List<Integer> result = new ArrayList<Integer>();
    	while (i >= 0 && j >= 0) {
    		intA = Character.getNumericValue(a.charAt(i));
    		intB = Character.getNumericValue(b.charAt(j));
    		currentResult = intA + intB + carry;
    		if (currentResult == 0) {
    			result.add(0, currentResult);
    			carry = 0;
    		} else if (currentResult == 1) {
    			result.add(0, currentResult);
    			carry = 0;
    		} else {
    			result.add(0, currentResult % 2);
    			carry = 1;
    		}
    		i--;
    		j--;
    	}
    	System.out.println(i + "," + j);
    	if (i == -1 && j == -1) {
    		if (carry == 1) {
    			result.add(0, carry);
    		}
    		System.out.println(result);
    	} else if (i == -1 && j != -1) {
    		while (j >= 0) {
    			intB = Character.getNumericValue(b.charAt(j));
    			currentResult = intB + carry;
    			if (currentResult == 0) {
        			result.add(0, currentResult);
        			carry = 0;
        		} else if (currentResult == 1) {
        			result.add(0, currentResult);
        			carry = 0;
        		} else {
        			result.add(0, currentResult % 2);
        			carry = 1;
        		}
    			j--;
    		}
    		if (carry == 1) {
    			result.add(0, carry);
    		}
    		System.out.println(result);
    	} else {
    		while (i >= 0) {
    			intA = Character.getNumericValue(a.charAt(i));
    			currentResult = intA + carry;
    			if (currentResult == 0) {
        			result.add(0, currentResult);
        			carry = 0;
        		} else if (currentResult == 1) {
        			result.add(0, currentResult);
        			carry = 0;
        		} else {
        			result.add(0, currentResult % 2);
        			carry = 1;
        		}
    			i--;
    		}
    		if (carry == 1) {
    			result.add(0, carry);
    		}
    		System.out.println(result);
    	}
    	String value = new String("");
    	for (Integer integer : result) {
    		value += String.valueOf(integer);
    	}
        return value;
    }
    
    public static void main(String[] args) {
    	LeetCode67 l = new LeetCode67();
    	String a = "1100000001";
    	String b = "1101";
    	int i = Character.getNumericValue(a.charAt(0));
    	int j = (int)a.charAt(2);
//    	System.out.println("1234".charAt(0));
//    	System.out.println(i);
//    	System.out.println(j);
    	System.out.println(l.addBinary(a, b));
    }

}
