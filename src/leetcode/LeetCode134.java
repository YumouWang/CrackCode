package leetcode;

public class LeetCode134 {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int result = -1;
		
		for (int i = 0; i < gas.length; i ++) {
			int j = 0;
			int totalGas = 0;
			int totalCost = 0;
			while (j < gas.length) {
				totalGas += gas[(i + j) % gas.length];
				totalCost += cost[(i + j) % gas.length];
				if (totalGas < totalCost) {
					break;
				}
				j ++;
			}
			if (j == gas.length) {
				return j - 1;
			}
		}
        return result;
    }
	
	public static void main(String[] args) {
		int[] gas = {1, 2};
		int[] cost = {2, 1};
		LeetCode134 l = new LeetCode134();
		System.out.println(l.canCompleteCircuit(gas, cost));
	}
	
	
	

}
