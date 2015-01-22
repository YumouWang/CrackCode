package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode93 {
	public List<String> restoreIpAddresses(String s) {
		List<String> result = new ArrayList<String>();
		for(int i = 0; i < Math.min(3, s.length() - 3); i ++) {
			for(int j = i + 1; j < Math.min(i + 4, s.length() - 2); j ++) {
				for(int n = j + 1; n < Math.min(j + 4, s.length() - 1); n ++) {
					String s1 = s.substring(0, i + 1);
					String s2 = s.substring(i + 1, j + 1);
					String s3 = s.substring(j + 1, n + 1);
					String s4 = s.substring(n + 1);
					if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
						result.add(s1 + "." + s2 + "." + s3 + "." + s4);
					}
				}
			}
		}
		return result;	
    }
	
	public boolean isValid(String s) {
		if(s.length() > 4) {
			return false;
		}
		if(s.startsWith("0") && !s.equals("0")) {
			return false;
		}
		Integer number = Integer.parseInt(s);
		if(number >= 0 && number < 256) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String ip = "2736786374048";
		String ip1 = "0000";
		System.out.println(ip.substring(0, 3));
		System.out.println(ip.substring(3, 6));
		System.out.println(ip.substring(6, 9));
		System.out.println(ip.substring(9, 11));
		System.out.println(ip.substring(1));
		
		LeetCode93 l = new LeetCode93();
		System.out.println(l.restoreIpAddresses(ip1));
	}



}
