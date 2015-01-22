package leetcode;

public class LeetCode1 {
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for(int i = 0; i < numbers.length; i ++) {
			if(numbers[i] < target) {
				for(int j = i + 1; j < numbers.length; j ++) {
					if(numbers[i] + numbers[j] == target) {
						result[0] = i + 1;
						result[1] = j + 1;
						break;
					}
				}
			}
			
		}
		return result;
    }
	
	public static void main(String[] args) {
		LeetCode1 l = new LeetCode1();
		int[] array = {2, 11, 7, 15};
		int[] result = l.twoSum(array, 9);
		System.out.println(result[0] + "," + result[1]);
	}
}
