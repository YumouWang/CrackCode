package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LeetCode18 {
    public List<List<Integer>> fourSum(int[] num, int target) {
    	List<List<Integer>> result = new ArrayList<List<Integer>>();
        Hashtable<List<Integer>, Integer> hashTable = new Hashtable<List<Integer>, Integer>();
        for (int i = 0; i < num.length; i++) {
        	for (int j = i + 1; j < num.length; j++) {
        		List<Integer> list = new ArrayList<Integer>();
        		list.add(i);
        		list.add(j);
        		hashTable.put(list, num[i] + num[j]);
        	}
        }
        System.out.println(hashTable);
        
        Set<List<Integer>> set = hashTable.keySet();
        Iterator<List<Integer>> iterator = set.iterator();
        
        while(iterator.hasNext()) {
        	List<Integer> key = iterator.next();
        	int value = hashTable.get(key);
        	Set<List<Integer>> set1 = hashTable.keySet();
            Iterator<List<Integer>> iterator1 = set1.iterator();
        	while (iterator1.hasNext()) {
        		List<Integer> key1 = iterator1.next();
            	int value1 = hashTable.get(key1);
        		if (value + value1 == target && key != key1) {
        			int num1 = key.get(0);
        			int num2 = key.get(1);
        			int num3 = key1.get(0);
        			int num4 = key1.get(1);
        			if (num1 == num3 || num1 == num4) {
        				
        			} else if (num2 == num3 || num2 == num4) {
        				
        			} else {
        				List<Integer> currentResult = new ArrayList<Integer>();
            			System.out.println(key);
            			System.out.println(key1);
            			currentResult.add(num[num1]);
            			currentResult.add(num[num2]);
            			currentResult.add(num[num3]);
            			currentResult.add(num[num4]);
            			Collections.sort(currentResult);
            			if (!result.contains(currentResult)) {
            				result.add(currentResult);
            			}
        			}        			
        		}       		
        	}      	        
        }
        return result;
    }
    
    public static void main(String[] args) {
    	LeetCode18 l = new LeetCode18();
    	System.out.println(l.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));
    }

}
