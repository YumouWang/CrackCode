package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode46 {
	public List<List<Integer>> permute(int[] num) {
		if (num == null) 
			return null;
	    if (num.length == 0) 
	    	return new ArrayList<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = doPermute(num, 0);
		return result;
	}

	public List<List<Integer>> doPermute(int[] num, int start) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		// List<Integer> list = new ArrayList<Integer>();
		if (num.length == start + 1) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(num[start]);
			result.add(list);
			return result;
		}

		List<List<Integer>> l = new ArrayList<List<Integer>>();
		l = doPermute(num, start + 1);
		for (List<Integer> list : l) {
			for(int i = 0; i <= list.size(); i ++) {
				List<Integer> newList = new ArrayList<Integer>(list);
	            newList.add(i, num[start]);
	            result.add(newList);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		LeetCode46 l = new LeetCode46();
		int[] test = new int[]{1,2,3};
		System.out.println(l.permute(test));
	}
}
