package leetcode;

public class LeetCode151 {
	public String reverseWords(String s) {
		String[] temp = s.split(" ");
		
		int j = 0;
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i].equals("")) {
				j++;
			}
		}
		String[] ss = new String[j];
		int index = 0;
		for (int i = 0; i < temp.length; i++) {
			if (!temp[i].equals("")) {
				ss[index] = temp[i];
				index++;
			}
		}
		
		String result = "";
		for(int i = ss.length - 1; i >= 0; i --) {
			result = result + ss[i] + " "; 
		}
        return result.trim();
    }
	
	public static void main(String[] args) {
		String s = "the sky is blue";
		String s1 = "   a   b ";
		String[] ss = s1.split(" ");
		for(String str : ss) {
			System.out.print(str + ",");
		}
		System.out.println();
		LeetCode151 l = new LeetCode151();
		System.out.println(l.reverseWords(s1));
	}

}
