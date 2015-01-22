package leetcode;

import java.util.ArrayList;
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
		numList.sort(null);		
		result = combinationSum(numList, target);		
		return result;
    }
	
	public List<List<Integer>> combinationSum(List<Integer> num, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> numList = num;
		if (num.size() == 0 || num == null) {
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
		for (int i = 0; i < num.size(); i ++) {
			int number = num.get(i);
			numList = num;
			numList.remove(i);
			System.out.println(numList);
			List<List<Integer>> temp = combinationSum(numList, target - number);
			for (List<Integer> list : temp) {
				list.add(number);
				result.add(list);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		LeetCode40 l = new LeetCode40();
		int[] num = new int[]{10,1,2,7,6,1,5};
		System.out.println(l.combinationSum2(num, 8));
	}

}
