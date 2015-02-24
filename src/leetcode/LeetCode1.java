package leetcode;

import java.util.HashMap;

public class LeetCode1 {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			hashMap.put(numbers[i], i + 1);
		}
		for (int i = 0; i < numbers.length; i++) {
			int value = target - numbers[i];
			if (hashMap.containsKey(value) && hashMap.get(value) != i + 1) {
				int index = hashMap.get(value);
				if (i + 1 < index)
					return new int[] { i + 1, index };
				return new int[] { index, i + 1 };
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		LeetCode1 l = new LeetCode1();
		int[] array = { 2, 1, 9, 4, 4, 56, 90, 3 };
		int[] result = l.twoSum(array, 8);
		System.out.println(result[0] + "," + result[1]);
	}
}
