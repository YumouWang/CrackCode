package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode47 {
    public List<List<Integer>> permuteUnique(int[] num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	List<List<Integer>> temp = new ArrayList<List<Integer>>();
    	if (num.length == 0) {
    		return result;
    	}
    	if (num.length == 1) {
    		List<Integer> currentList = new ArrayList<Integer>();
    		currentList.add(num[0]);
    		result.add(currentList);
    		return result;
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	for (int i = 0; i < num.length; i++) {
    		list.add(num[i]);
    	}
    	return permuteUnique(list);
    }
    
    public List<List<Integer>> permuteUnique(List<Integer> num) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
    	if (num.size() == 0) {
    		return result;
    	}
    	if (num.size() == 1) {
    		List<Integer> currentList = new ArrayList<Integer>();
    		currentList.add(num.get(0));
    		result.add(currentList);
    		return result;
    	}
    	List<Integer> temp = new ArrayList<Integer>();
    	for (int i = 0; i < num.size(); i++) {
    		temp.clear();
    		for (Integer integer : num) {
    			temp.add(integer);
    		}
    		temp.remove(num.get(i));
    		List<List<Integer>> tempResult = permuteUnique(temp);
    		for (List<Integer> list : tempResult) {
    			list.add(0, num.get(i));
    			if (!result.contains(list)) {
    				result.add(list);
    			} 			
    		}
    	}
    	return result;
    }
    
    public static void main(String[] args) {
    	LeetCode47 l = new LeetCode47();
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	System.out.println(l.permuteUnique(list));
    	System.out.println(l.permuteUnique(new int[]{1, 1, 2}));
    }

}
