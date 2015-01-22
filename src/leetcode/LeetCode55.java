package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode55 {
	public boolean canJump(int[] A) {
		List<Integer> position = new ArrayList<Integer>();
		
        if(A == null) {
        	return false;
        }
        if(A.length == 1) {
        	return true;
        }
        for(int i = 0; i < A.length - 1; i ++) {
        	if(A[i] == 0) {
        		position.add(i);
        	}
        }
        
        if(position.size() == 0) {
        	return true;
        } else {
        	for(Integer p : position) {
        		List<Integer> jumpPosition = new ArrayList<Integer>();
        		for(int i = 0; i < p; i ++) {
        			if(A[i] > p - i) {
        				jumpPosition.add(A[i]);
        			}
        		}
        		if(jumpPosition.size() == 0) {
        			return false;
        		}
        	}
        	return true;
        }
    }
	
	
	public static void main(String[] args) {
		int[] A = new int[]{2,3,1,1,4};
		int[] B = new int[]{3,2,1,0,4};
		LeetCode55 l = new LeetCode55();
		System.out.println(l.canJump(A));
		System.out.println(l.canJump(B));
	}

}
