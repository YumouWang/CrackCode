package Recursion;

public class Fibo {
	public int getFibo(int k) {
		if(k == 1) {
			return 0;
		}
		if(k == 2) {
			return 1;
		}
		else {
			return getFibo(k - 1) + getFibo(k - 2);
		}
	}
	
	public static void main(String[] args) {
		Fibo f = new Fibo();
		for(int i = 1; i < 20; i ++){
			System.out.print(f.getFibo(i) + ",");
		}
	}
}
