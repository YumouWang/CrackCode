package leetcode;

public class LeetCode38 {
    public String countAndSay(int n) {
        if (n <= 0) {
        	return "";
        }
        if (n == 1) {
        	return "1";
        }
        String str = countAndSay(n - 1);
        StringBuilder result = new StringBuilder("");
        int current = Integer.parseInt(String.valueOf(str.charAt(0)));
        int index = 0;
        int count = 0;
        while (index < str.length()) {
        	int temp = Integer.parseInt(String.valueOf(str.charAt(index)));
        	if (current == temp) {
        		count += 1;
        		index++;
        	} else {
        		result.append(String.valueOf(count));
        		result.append(String.valueOf(current));
        		current = temp;
        		count = 1;
        		index++;
        	}
        }
        result.append(String.valueOf(count));
		result.append(String.valueOf(current));
        return result.toString();
    }
    
    public static void main(String[] args) {
    	LeetCode38 l = new LeetCode38();
    	System.out.println(l.countAndSay(5));
    }

}
