package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] num) {
    	if (num == null || num.length == 0) {
    		
    	}
    	List<Integer> numbers = new ArrayList<Integer>();
    	for (int i = 0; i < num.length; i++) {
    		numbers.add(num[i]);
    	}
    	Collections.sort(numbers);
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	for (int i = 0; i < numbers.size(); i++) {
    		for (int j = i + 1; j < numbers.size(); j++) {
    			List<Integer> currentResult = new ArrayList<Integer>();
    			int a = numbers.get(i);
    			int b = numbers.get(j);
    			numbers.remove(i);
    			numbers.remove(j - 1);
    			if (numbers.contains(0 - a - b)) {
    				currentResult.add(a);
    				currentResult.add(b);
    				currentResult.add(0 - a - b);
    				Collections.sort(currentResult);
    				if (!result.contains(currentResult)) {
    					result.add(currentResult);
    				}
    			}
    			numbers.add(i, a);
    			numbers.add(j, b);
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	int[] S = new int[]{-1, 0, 1, 2, -1, -4};
    	LeetCode15 l = new LeetCode15();
    	System.out.println(l.threeSum(S));
    	int[] num = new int[]{};
    	System.out.println(num.length);
    }

}
