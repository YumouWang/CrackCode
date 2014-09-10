package CrackCode;

public class Replace {
	public char[] replace(char s[], int length) {
		int spaceLength = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] == ' ') {
				spaceLength++;
			}
		}
		int newLength = s.length + spaceLength *2;
		char[] newString = new char[newLength];
		int k = 0;
		for(int j = 0; j < s.length; j++) {
			if(s[j] == ' ') {
				newString[k++] = '%';
				newString[k++] = '2';
				newString[k++] = '0';
			}
			else {
				newString[k++] = s[j];
			}
		}
		return newString;
	}
	public static void main(String args[]) {
		char[] str = new char[]{'a','b',' ','c',' ','d'};
		Replace replace = new Replace();
		System.out.println(str);
		System.out.println(replace.replace(str, str.length));
	}

}