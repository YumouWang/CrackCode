package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode135 {
    public int candy(int[] ratings) {
        if (ratings.length == 0) {
        	return 0;
        }
        if (ratings.length == 1) {
        	return 1;
        }
        int length = ratings.length;
        List<Integer> list = new ArrayList<Integer>();
        if (ratings[0] < ratings[1]) {
        	list.add(1);
        } else {
        	list.add(2);
        }
        for (int i = 1; i < length - 2; i++) {
        	if (ratings[i] < ratings[i - 1] && ratings[i] < ratings[i + 1]) {
        		list.add(1);
        	} else {
        		list.add(2);
        	}
        }
        if (ratings[length - 1] < ratings[length - 2]) {
        	list.add(1);
        } else {
        	list.add(2);
        }
        System.out.println(list);
        
        return 0;
    }
    
    public static void main(String[] args) {
    	LeetCode135 l = new LeetCode135();
    	l.candy(new int[]{1, 2, 3, 4, 1});
    }

}
