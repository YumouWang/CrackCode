package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode39 {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		if (candidates == null) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentResult = new ArrayList<Integer>();
		int min = candidates[0];
		for (int i = 1; i < candidates.length; i++) {
			if (candidates[i] < min) {
				min = candidates[i];
			}
		}
		return combinationSum(candidates, target, min);
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target, int min) {
		if (candidates == null) {
			return null;
		}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentResult = new ArrayList<Integer>();

		if (target == 0) {
			result.add(currentResult);
			return result;
		}
		if (target < min || target < 0) {
			return null;
		}

		for (int i = 0; i < candidates.length; i++) {
			if (combinationSum(candidates, target - candidates[i]) != null) {
				List<List<Integer>> temp = combinationSum(candidates, target
						- candidates[i]);
				for (List<Integer> list : temp) {
					list.add(candidates[i]);
					Collections.sort(list);
					if (!result.contains(list)) {
						result.add(list);
					}
				}
			} else {
				continue;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[] candidates = new int[] { 4,8,11,10,9,3,12,7,6 };
		LeetCode39 l = new LeetCode39();
		System.out.println(l.combinationSum(candidates, 25));
	}
}
