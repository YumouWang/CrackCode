package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCode128 {
	public int longestConsecutive(int[] num) {
        if (num == null || num.length == 0) {
        	return 0;
        }
        if (num.length == 1) {
        	return 1;
        }
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < num.length; i ++) {
        	if (list.contains(num[i])) {
        		continue;
        	}
        	list.add(num[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        int temp = 1;
        int result = 1;
        for (int i = 1; i < list.size(); i++) {
        	if (list.get(i - 1) + 1 == list.get(i)) {
        		temp++;
        		if (temp > result) {
        			result = temp;
        		}
        	} else {
        		temp = 1;
        	}
        	
        }
        return result;
	}
	
	public static void main(String[] args) {
		LeetCode128 l = new LeetCode128();
		int[] array = new int[]{ 1, 2, 0, 1 };
		l.longestConsecutive(array);
		System.out.println(l.longestConsecutive(array));
	}

}
