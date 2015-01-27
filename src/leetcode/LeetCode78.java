package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode78 {
	public List<List<Integer>> subsets(int[] S) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < S.length; i++) {
			list.add(S[i]);
		}
		Collections.sort(list);

		return getSubsets(list.get(0), list.subList(1, list.size()));
	}

	public List<List<Integer>> getSubsets(int number, List<Integer> list) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (list.size() == 0) {
			List<Integer> currentResult = new ArrayList<Integer>();
			result.add(currentResult);
			currentResult.add(number);
			result.add(new ArrayList<Integer>(number));
			return result;
		}
		List<List<Integer>> temp = getSubsets(list.get(0),
				list.subList(1, list.size()));
		for (int i = 0; i < temp.size(); i++) {
			List<Integer> currentResult1 = new ArrayList<Integer>();
			for (int j = 0; j < temp.get(i).size(); j++) {
				currentResult1.add(temp.get(i).get(j));
			}
			currentResult1.add(0, number);
			result.add(temp.get(i));
			result.add(currentResult1);

		}
		return result;
	}

	public static void main(String[] args) {
		LeetCode78 l = new LeetCode78();
		int[] array = new int[] { 1, 2, 3 };
		System.out.println(l.subsets(array));
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		result.add(list);
		System.out.println(result + "," + result.size());
		System.out.println(list);
		
		
//		List<List<Integer>> result = new ArrayList<List<Integer>>();
//		List<Integer> currentResult = new ArrayList<Integer>();
//		result.add(currentResult);
//		System.out.println(result);
//		currentResult.add(1);
//		System.out.println(result);
//		result.add(new ArrayList<Integer>());
//		System.out.println(result);
	}

}
