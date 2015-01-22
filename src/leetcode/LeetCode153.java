package leetcode;

public class LeetCode153 {
	
	public int findMin(int[] num) {
        for(int i = 0; i < num.length - 1; i ++) {
        	if(num[i] > num[i + 1]) {
        		return num[i + 1];
        	}
        }
        return num[0];
    }
	
	public static void main(String[] args) {
		int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
		LeetCode153 l = new LeetCode153();
		System.out.println(l.findMin(array));
	}

}
