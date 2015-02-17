package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset {
	public List<List<Integer>> getSubset(List<Integer> num) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if (num.size() == 0) {
			result.add(list);
			return result;
		}
		if (num.size() == 1) {
			result.add(new ArrayList<Integer>());
			list.add(num.get(0));
			result.add(list);
			return result;
		}
		int number = num.get(0);
		num.remove(0);
		System.out.println(num);
		List<List<Integer>> tempResult = getSubset(num);
		for (List<Integer> l : tempResult) {
			result.add(l);
			List<Integer> currentList = new ArrayList<Integer>();
			currentList.add(number);
			for (Integer integer : l) {
				currentList.add(integer);
			}
			result.add(currentList);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Subset s = new Subset();
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		System.out.println(s.getSubset(num));
	}

}
