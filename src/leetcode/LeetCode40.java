package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode40 {
	public List<List<Integer>> combinationSum2(int[] num, int target) {
		if (num.length == 0) {
			return null;
		}

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i ++) {
			if (num[i] <= target) {
				numList.add(num[i]);
			}
		}
		Collections.sort(numList);
		result = combinationSum(numList, target);
		return result;
    }
	
	public List<List<Integer>> combinationSum(List<Integer> num, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> numList = new ArrayList<Integer>();
		if (num.size() == 0) {
			return result;
		}
		if (target == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		if (num.size() == 1) {
			if (num.get(0) == target) {
				List<Integer> currentResult = new ArrayList<Integer>();
				currentResult.add(num.get(0));
				result.add(currentResult);
				return result;
			} else {
				return result;
			}
		}
		
		numList.clear();
		for (int j = 0; j < num.size();j ++) {
			numList.add(num.get(j));
		}
		for (int i = 0; i < numList.size(); i ++) {
			int number = numList.get(i);			
			numList.remove(i);
			List<List<Integer>> temp = combinationSum(numList, target - number);
			if (temp != null) {			
				for (List<Integer> list : temp) {
					List<Integer> currentResult = list;
					currentResult.add(number);
					//Collections.sort(currentResult);
					if (!result.contains(currentResult)) {
						result.add(currentResult);
					}				
				}
			}			
		}
		return result;
	}
	
	public static void main(String[] args) {
		LeetCode40 l = new LeetCode40();
		int[] num = new int[]{5,4,5,1,5,3,1,4,5,5,4};
		System.out.println(l.combinationSum2(num, 10));
	}
}
