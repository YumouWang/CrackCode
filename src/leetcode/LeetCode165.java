package leetcode;

public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
    	String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        String str1 = trim(v1[0]);
        String str2 = trim(v2[0]);
        
        if (str1.length() > str2.length()) {
        	return 1;
        } else if (str1.length() < str2.length()) {
        	return -1;
        } else {
        	if (compareVersion1(str1, str2) == 1) {
        		return 1;
        	} else if (compareVersion1(str1, str2) == -1) {
        		return -1;
        	} else {
        		if (v1.length == 1 && v2.length == 1) {
        			return 0;
        		} else if (v1.length == 1 && v2.length != 1) {
        			return -1;
        		} else if (v1.length != 1 && v2.length == 1) {
        			return 1;
        		}
        		return compareVersion2(v1[1], v2[1]);
        	}
        }
    }
    
    public int compareVersion1(String version1, String version2) {
    	int length = version1.length();
    	for (int i = 0; i < length; i++) {
    		int v1 = Integer.parseInt(String.valueOf(version1.charAt(i)));
    		int v2 = Integer.parseInt(String.valueOf(version2.charAt(i)));
    		if (v1 > v2) {
    			return 1;
    		} else if (v1 < v2) {
    			return -1;
    		} else {
    			continue;
    		}
    	}
    	return 0;
    }
    
    public int compareVersion2(String version1, String version2) {
    	if (version1.length() > version2.length()) {
    		return 1;
    	} else if (version1.length() < version2.length()) {
    		return -1;
    	} else {
    		return compareVersion1(version1, version2);
    	}
    }
    
    public String trim(String str) {
    	int i = 0;
    	while(true) {
    		int v1 = Integer.parseInt(String.valueOf(str.charAt(i)));
    		if (v1 == 0) {
    			str = str.substring(1, str.length());
    		} else {
    			break;
    		}
    	}
    	return str;
    }
    
    public static void main(String[] args) {
    	LeetCode165 l = new LeetCode165();
    	System.out.println(l.compareVersion("1", "0"));
    	String str = "012345";
    	System.out.println(l.trim(str));
    }
}
