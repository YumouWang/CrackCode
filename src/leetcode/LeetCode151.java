package leetcode;

public class LeetCode151 {
	public String reverseWords(String s) {
		String[] ss = s.split(" ");
		String result = "";
		for(int i = ss.length - 1; i >= 0; i --) {
			result = result + ss[i] + " "; 
		}
        return result.trim();
    }
	
	public static void main(String[] args) {
		String s = "the sky is blue";
		String[] ss = s.split(" ");
		for(String str : ss) {
			System.out.println(str + ",");
		}
		LeetCode151 l = new LeetCode151();
		System.out.println(l.reverseWords(s));
	}

}
