package leetcode;

public class LeetCode162 {
    public int findPeakElement(int[] num) {
    	if (num.length == 0) {
    		return 0;
    	}
        int start = 0; 
        int end = num.length - 1;
        while (start < end) {
        	int mid = (start + end)/2;
        	if (num[mid] < num[mid + 1]) {
        		start = mid + 1;
        	} else {
        		end = mid;
        	}
        }
        return start;
    }
    
    public static void main(String[] args) {
    	
    }
}
