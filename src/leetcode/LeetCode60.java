package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode60 {
	public String getPermutation(int n, int k) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			list.add(i);
		}
		List<List<Integer>> result = getPermutation(list);
		List<Integer> resultString = new ArrayList<Integer>();
		if (k <= result.size()) {
			resultString = result.get(k - 1);
			String str = new String("");
			for (int i = 0; i < resultString.size(); i++) {
				str = str + String.valueOf(resultString.get(i));
			}
			return str;
		}
		return "";
	}

	public List<List<Integer>> getPermutation(List<Integer> list) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentList = new ArrayList<Integer>();
		if (list.size() == 0) {
			result.add(currentList);
			return result;
		}
		List<List<Integer>> temp = new ArrayList<List<Integer>>();

		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			List<Integer> tempList = new ArrayList<Integer>();
			for (int j = 0; j < list.size(); j++) {
				tempList.add(list.get(j));
			}
			tempList.remove(i);
			temp = getPermutation(tempList);
			for (List<Integer> l : temp) {
				l.add(0, num);
				result.add(l);
			}
		}
		return result;
	}

	public String getPermutation1(int n, int k) {
		if (n > 9)
			return "";
		if (n == 1)
			return "1";
		int[] num = new int[n + 1];
		num[0] = 1;
		for (int i = 1; i <= n; i++) {
			num[i] = num[i - 1] * i;
			System.out.println(num[i]);
		}
			
		k = k - 1;
		k = k % num[n];
		System.out.println("k = " + k);
		StringBuffer numStr = new StringBuffer("123456789");
		StringBuffer res = new StringBuffer();
		for (int i = n - 1; i >= 0; i--) {
			int curNum = k / num[i];
			System.out.println("curNum = " + curNum);
			res.append(numStr.charAt(curNum));
			numStr.deleteCharAt(curNum);
			k = k - curNum * num[i];
		}
		return res.toString();
	}

	public static void main(String[] args) {
		LeetCode60 l = new LeetCode60();
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		// System.out.println(list);
		System.out.println(l.getPermutation(list));
		System.out.println(l.getPermutation(7, 6));
		System.out.println(l.getPermutation1(7, 6));
	}
}
