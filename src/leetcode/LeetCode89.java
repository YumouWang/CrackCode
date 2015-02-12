package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode89 {
    public List<Integer> grayCode(int n) {
    	List<Integer> result = new ArrayList<Integer>();
    	
        if (n == 0) {
        	result.add(0);
        	return result;
        }
        if (n == 1) {
        	result.add(0);
        	result.add(1);
        	return result;
        }
        List<Integer> temp = grayCode(n - 1);
        for (Integer integer : temp) {
        	result.add(integer);
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
        	result.add((int) (temp.get(i) + Math.pow(2, n - 1)));
        }
        return result;
    }
    
	public static void main(String[] args) {
		LeetCode89 l = new LeetCode89();
		System.out.println(l.grayCode(3));		
	}

}
