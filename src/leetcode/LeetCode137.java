package leetcode;

import java.util.Hashtable;
import java.util.Set;

public class LeetCode137 {
	public int singleNumber(int[] A) {
        if(A.length == 0) {
        	return -1;
        }
        if(A.length == 1) {
        	return A[0];
        }
        
        int max = A[0];
        int min = A[0];
        for(Integer integer : A) {
        	if(integer > max) {
        		max = integer;
        	}
        	if(integer < min) {
        		min = integer;
        	}
        }
        System.out.println(min);
                
        int[] temp = new int[max - min + 1];
        for(int i = 0; i < A.length; i ++) {
        	System.out.println(A[i] - min + "," + i);
        		temp[A[i] - min] = temp[A[i] - min] + 1;
        }
        
        for(int i = 0; i < temp.length; i ++) {
        	System.out.println(temp[i]);
        	if(temp[i] == 1) {
        		return i + min;
        	}
        }
		return -1;
    }
	
	public boolean isContain(Hashtable<Integer, Integer> hashTable, int number) {
		Set<Integer> keys = hashTable.keySet();
    	for(Integer key: keys){ 
    		if(key == number) {
    			return true;
    		}		
		}
    	return false;
	}
	
	public static void main(String[] args) {
		int[] A = new int[]{43,16,45,89,45,-2147483648,45,2147483646,-2147483647,-2147483648,43,2147483647,-2147483646,-2147483648,89,-2147483646,89,-2147483646,-2147483647,2147483646,-2147483647,16,16,2147483646,43};
		//int[] A = new int[]{43, -2, -2, -2};
		int[] B = new int[]{1};
		LeetCode137 l = new LeetCode137();
		System.out.println(l.singleNumber(A));
	}
}
