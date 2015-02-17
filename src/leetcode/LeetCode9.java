package leetcode;

public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x / 10 == 0)
            return true;

        int left = x, right = 0;
        while(left >= right) {
            right = right * 10 + left % 10;
            left = left / 10;
            
            System.out.println(left + "," + right);

            if(right == 0)
                return false;
            if((left >= 10 && right == left / 10) || (left == right))
                return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
    	LeetCode9 l = new LeetCode9();
    	System.out.println(l.isPalindrome(123321));
    	System.out.println(l.isPalindrome(33));
    }

}
