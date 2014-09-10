package CrackCode;
import java.util.ArrayList;


public class Permutation {
	public ArrayList<String> getPerms(String s) {
		ArrayList<String> permutations = new ArrayList<String>();
		if(s == null) {
			return null;
		}
		else if(s.length() == 0) {
			permutations.add("");
			return permutations;
		}
		
		char first = s.charAt(0);
		String reminder = s.substring(1);
		ArrayList<String> words = getPerms(reminder);
		for (String word : words) {
			for (int i = 0; i <= word.length(); i++) {
				permutations.add(insertCharAt(word,first,i));
			}
		}
		
		return permutations;
	}
	public String insertCharAt(String word, char c, int i) {
		String start = word.substring(0,i);
		String end = word.substring(i);
		return start + c + end;
	 }
	
	
	public static void main(String args[]){
		String test = "abc";
		Permutation p = new Permutation();
		ArrayList<String> p1 = p.getPerms(test);
		for(int j = 0; j < p1.size(); j++) {
			System.out.println(p1.get(j));
		}
		for(String p2 : p1) {
			System.out.println();
		}
	}
	

}
