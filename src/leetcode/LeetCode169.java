package leetcode;

import java.util.HashMap;

public class LeetCode169 {
	public int majorityElement(int[] num) {
		int result = 0;
		int half = num.length / 2;
		
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < num.length; i ++) {
			if(hashMap.containsKey(num[i])) {
				int value = hashMap.get(num[i]);
				value ++;
				hashMap.put(num[i], value);
			} else {
				hashMap.put(num[i], 1);
			}
			if (hashMap.get(num[i]) > half) {	            
	            return num[i];
	        }
		}
		return result;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 100, 1, 2, 3, 3, 3, 3 };
		LeetCode169 l = new LeetCode169();
		System.out.println(l.majorityElement(array));
	}

}
