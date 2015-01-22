package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
    	ArrayList<Integer> result = new ArrayList<Integer>();
        for(List<Integer> list : triangle) {
        	int temp = list.get(0);
            for(Integer integer : list) {
            	if(integer < temp) {
            		temp = integer;
            	}
            }
            System.out.println(temp);
            result.add(temp);
        }
        
        int minimumTotal = 0;
        for(Integer integer : result) {
        	minimumTotal += integer;
        }
        return minimumTotal;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	List<Integer> list1 = new ArrayList<Integer>();
    	List<Integer> list2 = new ArrayList<Integer>();
    	List<Integer> list3 = new ArrayList<Integer>();
    	list1.add(-1);
    	list2.add(2);
    	list2.add(3);
    	list3.add(1);
    	list3.add(-1);
    	list3.add(-3);
    	
    	List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    	triangle.add(list1);
    	triangle.add(list2);
    	triangle.add(list3);
    	System.out.println(s.minimumTotal(triangle));
    }
    
}
