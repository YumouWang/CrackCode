package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode90 {
	public List<List<Integer>> subsetsWithDup(int[] num) {
        List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num.length; i++) {
			list.add(num[i]);
		}
		Collections.sort(list);

		return getSubsets(list.get(0), list.subList(1, list.size()));
	}

    public List<List<Integer>> getSubsets(int number, List<Integer> list) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (list.size() == 0) {
			List<Integer> currentResult = new ArrayList<Integer>();		
			currentResult.add(number);
			result.add(currentResult);
			result.add(new ArrayList<Integer>());
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
			if (result.contains(currentResult1)) {
				result.add(temp.get(i));
			} else if (result.contains(temp.get(i))) {
				result.add(currentResult1);
			} else {
				result.add(temp.get(i));
				result.add(currentResult1);
			}
		}
		return result;
	}
    
    public static void main(String[] args) {
    	LeetCode90 l = new LeetCode90();
		int[] array = new int[] { 1, 1, 2, 2 };
		System.out.println(l.subsetsWithDup(array));
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
