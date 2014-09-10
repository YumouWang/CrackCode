package CrackCode;

public class CheckRotation {
	public boolean isRotation(String str1, String str2) {
		if(str1.length() == str2.length() && str1.length() > 0) {
			String s1s2 = str1 + str1;
			return
					isSubstring(s1s2,str2);
		}
		return false;
	}
	
	public boolean isSubstring(String str1, String str2) {
		if(str1.contains(str2)) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		String s1 = "abcd";
		String s2 = "bcda";
		CheckRotation c = new CheckRotation();
		System.out.println(c.isSubstring(s1, s2));
		System.out.println(c.isRotation(s1, s2));
	}

}
