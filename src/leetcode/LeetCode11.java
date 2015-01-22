package leetcode;

import java.util.ArrayList;

public class LeetCode11 {
	public int maxArea(int[] height) {
		ArrayList<Integer> result = new ArrayList<Integer>();
        if(height.length < 2) {
        	return 0;
        }
        for(int i = 0; i < height.length - 1; i ++) {
        	for(int j = i + 1; j < height.length; j ++) {
        		result.add((j - i) * Math.min(height[i], height[j]));
        	}
        }
        int max = 0;
        for(Integer r : result) {
        	if(r > max) {
        		max = r;
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		
	}
	

}
