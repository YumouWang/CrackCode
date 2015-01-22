package leetcode;

public class LeetCode70 {
	public int climbStairs(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);	
    }
	
	public int climbStairs1(int n) {
	    if(n==0) return 0;
	    if(n==1) return 1;
	    if(n==2) return 2;

	    int i=3;
	    int this_step=0;
	    int one_step_shorter=2;
	    int two_step_shorter=1;

	    while(i<=n){
	        this_step=one_step_shorter+two_step_shorter;
	        two_step_shorter=one_step_shorter;
	        one_step_shorter=this_step;
	        i++;
	    }

	    return this_step;
	}
	
	public int climbStairs2(int n) {
        int steps[] = new int[n + 1];
        for(int i = 0; i <= n; i++){
            if(i == 0 || i == 1)
                steps[i] = 1;
            else{
                steps[i] = steps[i - 1] + steps[i - 2];
            }
        }
        return steps[n];
    }
	
	public static void main(String[] args) {
		LeetCode70 l = new LeetCode70();
		System.out.println(l.climbStairs(40));
		System.out.println(l.climbStairs1(40));
		System.out.println(l.climbStairs2(40));
	}
}
