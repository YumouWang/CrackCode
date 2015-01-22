package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1) {
            return null;
        }
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    	
    	List<Integer> list1 = new ArrayList<Integer>();
    	list1.add(1);
    	List<Integer> list2 = new ArrayList<Integer>();
    	list2.add(1);
    	list2.add(1);
    	
    	result.add(list1);
    	
    	if(numRows == 1) {
            return result;
        }
        
        
    	result.add(list2);
    	
    	if(numRows == 2) {
            return result;
        }
    	
    	
    	for(int i = 2; i < numRows; i ++) {
    		List<Integer> list = new ArrayList<Integer>();
    		list.add(1);
    		//list.add(i, 1);
    		List<Integer> temp = result.get(i - 1);
    		for(int n = 1; n < i; n ++) {
    			list.add(temp.get(n - 1) + temp.get(n));
    		}
    		list.add(1);
    		result.add(list);
    	}        
    	return result;
    }
    
    public static void main(String[] args) {
    	Solution1 s = new Solution1();
    	System.out.println(s.generate(0));
    }
}
