package leetcode;

public class Palindrome {
	public int reverse(int number) {
		int reverse = 0;
		if(number < 0) {
			return 0;
		}
		while(number != 0) {
			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		return reverse;	
	}
	
	public boolean isPalindrome(int number) {
		if(number == reverse(number)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Palindrome p = new Palindrome();
		System.out.println(p.reverse(12345));
		System.out.println(p.isPalindrome(12321));
		System.out.println(p.isPalindrome(1232));
	}
}
