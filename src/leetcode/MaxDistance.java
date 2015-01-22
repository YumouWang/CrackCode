package leetcode;

public class MaxDistance {
	public int getMaxDistance(int[] array) {
		int maxDistance = 0;
		for (int i = 0; i < array.length; i ++) {
			for(int j = i + 1; j < array.length; j ++) {
				if(array[j] > array[i] && (j - i) > maxDistance) {
					maxDistance = j - i;
				}
			}
		}
		return maxDistance;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{10, 9, 2, 7, 4, 100, 24, 87, 35, 10, 2, 12};
		MaxDistance m = new MaxDistance();
		System.out.println(m.getMaxDistance(array));
	}
}
